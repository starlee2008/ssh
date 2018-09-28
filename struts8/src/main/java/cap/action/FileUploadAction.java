package cap.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;


public class FileUploadAction extends ActionSupport {
    private File file;
    private String fileFileName;


    public String upload() {
        try {
            InputStream io = new FileInputStream(file);
            OutputStream os = new FileOutputStream("d:\\" + fileFileName);
            byte[] buffer = new byte[1024];
            int lenght = 0;
            while ((lenght = io.read(buffer)) != -1) {
                os.write(buffer, 0, lenght);
            }
            os.close();
            io.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }
}
