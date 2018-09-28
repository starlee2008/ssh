package cap.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;
import java.util.List;


public class FileUploadsAction extends ActionSupport {
    private List<File> file;
    private List<String> fileFileName;


    public String uploads() {
        InputStream io = null;
        OutputStream os = null;
        try {
            for (int i = 0; i < file.size(); i++) {
                io = new FileInputStream(file.get(i));
                File destFile = new File("d:" + "\\", this.getFileFileName().get(i));
                os = new FileOutputStream(destFile);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = io.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
                }
            }

            os.close();
            io.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public List<File> getFile() {
        return file;
    }

    public void setFile(List<File> file) {
        this.file = file;
    }

    public List<String> getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(List<String> fileFileName) {
        this.fileFileName = fileFileName;
    }
}
