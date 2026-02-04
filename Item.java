@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String imageUrl;
    private String status; // FOUND, CLAIMED, UNCLAIMED

    private Long foundByUserId;

    private LocalDateTime createdAt = LocalDateTime.now();
}
