@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item postFoundItem(Item item) {
        item.setStatus("FOUND");
        return itemRepository.save(item);
    }

    public List<Item> getAvailableItems() {
        return itemRepository.findByStatus("FOUND");
    }
}
