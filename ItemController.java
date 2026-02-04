@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> postItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.postFoundItem(item));
    }

    @GetMapping
    public ResponseEntity<List<Item>> getItems() {
        return ResponseEntity.ok(itemService.getAvailableItems());
    }
}
