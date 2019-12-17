务器端（接收端） 
   public void run() {
            int serverPort = 8180;
            try {
                ServerSocket serverSocket = new ServerSocket(serverPort);
                String content = null;
                while (true){
                    String serverAddress = "127.0.0.1";
                    Socket socket = serverSocket.accept();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                    if(content == null) {
System.out.println("服务器收到："+bufferedReader.readLine());
                        content = "He say:" + bufferedReader.readLine();
                    }else {
                        content = content + "\n" + "He say:" + bufferedReader.readLine();
                    }
                    ServerSocketTcp(content);
            }catch (IOException e) {
                e.printStackTrace();
            }
    }
}
发送端：
public void actionPerformed(ActionEvent ae) {
    String message = inputText.getText();
    try {
        String serverAddress = ipText.getText();
        int serverPort = 8180;
        Socket socket = new Socket(serverAddress, serverPort);
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write(message);
        bufferedWriter.flush();
        socket.shutdownOutput();
    }catch (UnknownHostException e) {
        e.printStackTrace();
    } catch (ConnectException e) {
        System.out.println("can not get connection, please try again!");
    } catch (IOException e) {
        e.printStackTrace();
    }
}