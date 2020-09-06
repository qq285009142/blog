package com.djl.web;

import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFtp {
    public static void main(String[] args) {
        String msg = "HelloWorldAction [pppoeNum=1880591004283, passWord=129808, vlanId=400, connectionType=PPPoE_Routed, wbandLanInterface=LAN1,lan3, iptvLanInterface=]";
            Pattern p1 = Pattern.compile("connectionType=(.*?)wbandLanInterface");
            Matcher m2 = p1.matcher(msg);
            while(m2.find()){
                String str = m2.group(1);
                System.out.println(1+str.replace(",",""));;
            }
            Pattern p=Pattern.compile("wbandLanInterface=(.*?)iptvLanInterface=");
            Matcher m=p.matcher(msg);
            while (m.find()) {
                String str = m.group(1);
                if (str.length() > 2) {
//                    System.out.println(3+str.substring(0, str.length() - 2));
//                }else {
                    System.out.println(2+str);
                }
            }
//        List<String> list = new ArrayList<String>();
//        FTPClient ftpClient = new FTPClient();
//        ftpClient.setControlEncoding(getControlEncoding());
//        try {
//            ftpClient.connect("129.204.207.127", 21);
//            boolean ret = ftpClient.login("root", "dengjinglei0427..");
//            if (!ret) {
//                System.out.println("error");
//            }
//            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//            ftpClient.enterLocalPassiveMode();
//            FTPFile[] files = ftpClient.listFiles("djl/aaa");
//
//            ftpClient.changeWorkingDirectory("djl/aaa");
//            InputStream inputStream=ftpClient.retrieveFileStream("111.jar");
//            System.out.println(inputStream.toString());
//
//            System.out.println(files.length);
//            for(int i = 0; i < files.length; i++){
//                if(files[i].isFile()){
//                    list.add(files[i].getName());
//                    System.out.println(files[i].getName());
//                }
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        } finally {
//            try {
//                ftpClient.quit();
//            } catch (Exception ex){}
//        }
    }
    private static String getControlEncoding() {

        String ret = "";
        try {
            ResourceBundle rb = ResourceBundle.getBundle("ftp");
            ret = rb.getString("ftp.encoding");
        } catch (Exception ex) {
            ret = "UTF-8";
        }

        return ret;
    }
//    public static byte[] getFtpFileStream(String path, String fileName)
//            throws Exception {
//
//        FTPClient ftpClient = null;
//        byte[] data = null;
//        try {
//            ftpClient = new FTPClient();
//            ftpClient.connect("129.204.207.127", 21);
//            boolean ret = ftpClient.login("root", "dengjinglei0427..");
//            if (!ret) {
//                System.out.println("error");
//            }
//
//            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//            ftpClient.enterLocalPassiveMode();
//            if (path.startsWith("/")){
//                path = path.substring(1);
//            }
//            String[] folders = path.split("/");
//            for (int i = 0; i < folders.length; i++) {
//                String targer = folders[i] + "/";
//                try {
//                    ftpClient.chdir(targer);
//                } catch (Exception e) {
//                    throw e;
//                }
//            }
//            // ftp.chdir(server.ftpRootdir + path);
//            // 2007.04.02 edit end
//
//            data = ftpClient.get(fileName);
//        } catch (Exception ex) {
//            throw ex;
//        } finally {
//            ftp.quit();
//        }
//
//        return data;
//    }
}
