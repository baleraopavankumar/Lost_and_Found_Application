public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByStatus(String status);
}
