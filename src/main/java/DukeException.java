public class DukeException extends Exception {

    public DukeException() {
        System.out.println("idk what you are saying");
    }

    public DukeException(String problem) {
        System.out.println(problem);
    }

    public DukeException(Throwable cause) {
        System.out.println(cause);
    }

    public DukeException(IllegalArgumentException i) {
        System.out.println("did you forget a keyword? ie /by /to /from");
    }

    public DukeException(IndexOutOfBoundsException i) {
        System.out.println("Did you try to mark a task that is not in the list?");
    }

    public DukeException(NumberFormatException i) {
        System.out.println("You must input a number");
    }


}
