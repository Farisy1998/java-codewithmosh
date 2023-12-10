package ComposingCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    private static CompletableFuture<String> getEmail() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    private static CompletableFuture<String> getPlaylist(String email) {
        return CompletableFuture.supplyAsync(() -> "Playlist");
    }

    public static void doTask() {
        // get the playlist based on a user email
        getEmail()
            .thenCompose(CompletableFutureDemo::getPlaylist)
            .thenAccept(playlist -> System.out.println(playlist));
    }
}
