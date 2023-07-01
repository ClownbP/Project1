package jade;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;

public class Window {
    private int width,height;
    private String title;
    private static Window window = null;
    private Window(){
        this.height= 1920;
        this.width= 1080;
        this.title= "Marioo";
    }
   public static Window get(){
                if(Window.window == null){
                    Window.window = new Window();
                }
               return Window.window;
   }
   public static void run(){
        System.out.println("Hello LWJGL" + Version.getVersion() + "!");

        init();
        loop();
   }
   public static void init(){
       GLFWErrorCallback.createPrint(System.err).set();
   }
   public static void loop(){

   }
}
