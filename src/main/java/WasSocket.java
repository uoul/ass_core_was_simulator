import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.Vector;

public class WasSocket {
    private final static int PORT = 47000;
    private static Vector<String> responses = new Vector<>();

    public static void main(String[] args) throws IOException
    {
        responses.add("<?xml version=\"1.0\" encoding=\"iso-8859-15\" standalone=\"yes\"?>\n" +
                "<pdu>\n" +
                "    <order-list count=\"2\">\n" +
                "        <order index=\"1\">\n" +
                "            <key>0x07abe41b</key>\n" +
                "            <origin tid=\"0300012\">Linz-Stadt</origin>\n" +
                "            <receive-tad>2008-11-06 13:21:01</receive-tad>\n" +
                "            <operation-id>BWSt40001 </operation-id>\n" +
                "            <level>1</level>\n" +
                "            <name>Max Mustermann</name>\n" +
                "            <operation-name>BRAND BAUM-, FLUR-, BÖSCHUNG</operation-name>\n" +
                "            <caller>+43 650 5555555</caller>\n" +
                "            <location>Musterstraße 42, 4300 Musterstadt</location>\n" +
                "            <info>HILFE!!!</info>\n" +
                "            <program>Feuer</program>\n" +
                "            <status>Ausgerückt</status>\n" +
                "            <watch-out-tad>2008-11-06 13:46:44</watch-out-tad>\n" +
                "            <finished-tad></finished-tad>\n" +
                "            <destination-list count=\"2\">\n" +
                "                <destination index=\"1\" id=\"40117\">Test 1</destination>\n" +
                "                <destination index=\"2\" id=\"40120\">Test 2</destination>\n" +
                "            </destination-list>\n" +
                "            <paging-destination-list count=\"1\">\n" +
                "                <paging-destination index=\"1\" id=\"40122\">Test3</paging-destination>\n" +
                "            </paging-destination-list>\n" +
                "        </order>\n" +
                "        <order index=\"2\">\n" +
                "            <key>0x07abe41c</key>\n" +
                "            <origin tid=\"0300012\">Linz-Stadt</origin>\n" +
                "            <receive-tad>2008-11-06 13:48:41</receive-tad>\n" +
                "            <operation-id>BWSt40002 </operation-id>\n" +
                "            <level>1</level>\n" +
                "            <name>Hasso</name>\n" +
                "            <operation-name>TE TIERRETTUNG</operation-name>\n" +
                "            <caller>+43 650 4444444</caller>\n" +
                "            <location>0000 Musterhausen, Musterweg 1</location>\n" +
                "            <info>Tiger im Tank</info>\n" +
                "            <program>Feuer</program>\n" +
                "            <status>Alarmiert</status>\n" +
                "            <watch-out-tad></watch-out-tad>\n" +
                "            <finished-tad></finished-tad>\n" +
                "            <destination-list count=\"1\">\n" +
                "                <destination index=\"1\" id=\"40117\">Test 1</destination>\n" +
                "            </destination-list>\n" +
                "        </order>\n" +
                "    </order-list>\n" +
                "</pdu>");

        responses.add("<?xml version=\"1.0\" encoding=\"iso-8859-15\" standalone=\"yes\"?>\n" +
                "<pdu>\n" +
                "    <order-list count=\"1\">\n" +
                "        <order index=\"1\">\n" +
                "            <key>0x07abe41b</key>\n" +
                "            <origin tid=\"0300012\">Linz-Stadt</origin>\n" +
                "            <receive-tad>2008-11-06 13:21:01</receive-tad>\n" +
                "            <operation-id>BWSt40001 </operation-id>\n" +
                "            <level>1</level>\n" +
                "            <name>Max Mustermann</name>\n" +
                "            <operation-name>BRAND BAUM-, FLUR-, BÖSCHUNG</operation-name>\n" +
                "            <caller>012345</caller>\n" +
                "            <location>Musterstraße 42</location>\n" +
                "            <info>HILFE!!!</info>\n" +
                "            <program>Feuer</program>\n" +
                "            <status>Ausgerückt</status>\n" +
                "            <watch-out-tad>2008-11-06 13:46:44</watch-out-tad>\n" +
                "            <finished-tad></finished-tad>\n" +
                "            <destination-list count=\"2\">\n" +
                "                <destination index=\"1\" id=\"40117\">Test 1</destination>\n" +
                "                <destination index=\"2\" id=\"40120\">Test 2</destination>\n" +
                "            </destination-list>\n" +
                "            <paging-destination-list count=\"1\">\n" +
                "                <paging-destination index=\"1\" id=\"40122\">Test3</paging-destination>\n" +
                "            </paging-destination-list>\n" +
                "        </order>\n" +
                "    </order-list>\n" +
                "</pdu>");
        responses.add("<?xml version=\"1.0\" encoding=\"iso-8859-15\" standalone=\"yes\"?>\n" +
                "<pdu>\n" +
                "    <order-list count=\"1\">\n" +
                "        <order index=\"1\">\n" +
                "            <key>0x07abe41b</key>\n" +
                "            <origin tid=\"0300012\">Linz-Stadt</origin>\n" +
                "            <receive-tad>2008-11-06 13:21:01</receive-tad>\n" +
                "            <operation-id>BWSt40001 </operation-id>\n" +
                "            <level>1</level>\n" +
                "            <name>Max Mustermann</name>\n" +
                "            <operation-name>BRAND BAUM-, FLUR-, BÖSCHUNG</operation-name>\n" +
                "            <caller>012345</caller>\n" +
                "            <location>Musterstraße 42</location>\n" +
                "            <info>HILFE!!!</info>\n" +
                "            <program>Feuer</program>\n" +
                "            <status>Ausgerückt</status>\n" +
                "            <watch-out-tad>2008-11-06 13:46:44</watch-out-tad>\n" +
                "            <finished-tad></finished-tad>\n" +
                "            <destination-list count=\"2\">\n" +
                "                <destination index=\"1\" id=\"40117\">Test 1</destination>\n" +
                "                <destination index=\"2\" id=\"40120\">Test 2</destination>\n" +
                "            </destination-list>\n" +
                "            <paging-destination-list count=\"1\">\n" +
                "                <paging-destination index=\"1\" id=\"40122\">Test3</paging-destination>\n" +
                "            </paging-destination-list>\n" +
                "        </order>\n" +
                "    </order-list>\n" +
                "</pdu>");
        responses.add("<?xml version=\"1.0\" encoding=\"iso-8859-15\" standalone=\"yes\"?>\n" +
                "<pdu>\n" +
                "</pdu>");

        ServerSocket serverSocket = new ServerSocket(PORT);

        System.out.println("Listening on port " + PORT);

        while (true) {
            try (Socket socket = serverSocket.accept();
                 InputStreamReader isr = new InputStreamReader(socket.getInputStream());
                 BufferedReader in = new BufferedReader(isr);
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
            ) {
                System.out.println("Connection accepted");

                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("Server received: " + line);
                    Random random = new Random();
                    out.println(responses.get(random.nextInt(0, responses.size() - 1)));
                }
            }
        }
    }
}
