package theater.project.MovieTheater.DataPersistent.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import theater.project.MovieTheater.DataPersistent.Enum.Status;

@Data
@Entity
@Table(name="seats")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @Column(name="seat_number")
    private int seatNumber;
    private String rowNumber;

//    @Column(name="seat_status")
    private Status seatStatus;

    @JoinColumn(name="showing_id")
    @ManyToOne
    private Showing showing;

}
