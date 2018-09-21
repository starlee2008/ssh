package cap.action;

import cap.bean.Province;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class RegisterAction extends ActionSupport {
    private String username;
    private String password;
    private String gender;
    private String province;
    private String about;
    private String[] skills;
    private Boolean confirm;
    private List<Province> provinceList = new ArrayList<>();
    private List<String> skiList = new ArrayList<>();

    public String register() {
        return SUCCESS;
    }

    public String fill() {

        provinceList.add(new Province(1, "北京"));
        provinceList.add(new Province(2, "上海"));
        provinceList.add(new Province(3, "天津"));
        provinceList.add(new Province(3, "重庆"));

        skiList.add("C");
        skiList.add("Java");
        skiList.add(".Net");
        skiList.add("C++");
        skills = new String[]{"Java", ".Net"};
        confirm = true;
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Boolean getConfirm() {
        return confirm;
    }

    public void setConfirm(Boolean confirm) {
        this.confirm = confirm;
    }

    public List<Province> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<Province> provinceList) {
        this.provinceList = provinceList;
    }

    public List<String> getSkiList() {
        return skiList;
    }

    public void setSkiList(List<String> skiList) {
        this.skiList = skiList;
    }
}
