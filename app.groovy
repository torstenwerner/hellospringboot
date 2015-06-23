@RestController
class App {
    @RequestMapping("/")
    def hi() { "Hello, world!" }
}
