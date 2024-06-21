/**
 * ProcessExample
 */
public class ProcessExample {
    public static void main(String[] args)
    {
        try {
            // create a new process to run vscode on  
            ProcessBuilder builder = new ProcessBuilder("code");
            Process vscodeProcess = builder.start();

            // get vscode app process pid
            long vscodePid = vscodeProcess.pid();
            System.out.println("vscodeProcess pid : " + vscodePid);
            
            // destroy the vscode app process after 10 sec
            Thread.sleep(10000); // sleep 10 sec
            vscodeProcess.destroyForcibly(); // destroyForcibly() method destroy the Process instance

            // we can get the exit value of the process after destroyed
            int vscodeExitValue = vscodeProcess.exitValue();
            System.out.println("vscodeProcess exit value : " + vscodeExitValue);

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}