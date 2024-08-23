package tratamento_excecoes.ex_01.model.entities;

import tratamento_excecoes.ex_01.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
        if (checkout.before(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;

    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) throws DomainException {
        Date now = new Date();
        if (checkout.before(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        if (checkin.before(this.getCheckIn()) || checkin.before(now) || checkout.before(now)) {
            throw new DomainException("Reservation dates for updates must be future dates");
        }
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation: ");
        sb.append("Room ").append(roomNumber).append(", ");
        sb.append("check-in: ").append(sdf.format(checkIn)).append(", ");
        sb.append("check-out: ").append(sdf.format(checkOut)).append(", ");
        sb.append(duration()).append(" nights");

        return String.valueOf(sb);
    }
}
