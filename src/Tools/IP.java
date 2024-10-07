package Tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class IP {

    public static String getIPAddress() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            String command = "";
            String gateway = "";
            // Determine command based on the OS
            if (os.contains("win")) {
                command = "ipconfig";
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                command = "netstat -rn";
            } else {
                System.out.println("Unsupported operating system.");

            }

            // Execute the command
            ProcessBuilder builder = new ProcessBuilder(command.split(" "));
            Process process = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            String gatewayPattern = os.contains("win") ? "Default Gateway" : "0.0.0.0";

            while ((line = reader.readLine()) != null) {
                // Check for default gateway in the output
                if (line.contains(gatewayPattern)) {
                    if (os.contains("win")) {
                        // For Windows, extract the IP address from the line
                        gateway = line.split(":")[1].trim();

                    } else {
                        // For Linux/Mac, extract the default gateway from routing table
                        Pattern pattern = Pattern.compile("\\d+\\.\\d+\\.\\d+\\.\\d+");
                        Matcher matcher = pattern.matcher(line);
                        if (matcher.find()) {
                            gateway = matcher.group();

                        }
                    }
                }
            }
            return gateway;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
