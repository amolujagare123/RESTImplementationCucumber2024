package Util.POJO.chatServer;

import java.util.List;

public class CreateUserResponsePOJO {
  /*  private int id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String filepath;
    private String filename;
    private String surname;
    private String jobTitle;
    private String departmentsIds;
    private String skype;
    private String xmppUsername;
    private boolean disabled;
    private boolean hideOnline;
    private boolean allDepartments;
    private boolean invisibleMode;
    private String timeZone;
    private int recPerReq;
    private String sessionId;
    private String chatNickname;
    private String operationAdmin;
    private boolean inactiveMode;
    private int maxActiveChats;
    private boolean autoAccept;
    private boolean excludeAutoasign;
    private long pswdUpdated;
    private boolean alwaysOn;
    private String avatar;
    private int attrInt1;
    private int attrInt2;
    private int attrInt3;
    private String passwordTemp1;
    private String passwordFront;
    private List<Integer> userGroupsId;
    private List<Integer> departmentGroups;
    private List<Integer> departmentsIdsReadArray;
    private List<Integer> departmentsIdsArray;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartmentsIds() {
        return departmentsIds;
    }

    public void setDepartmentsIds(String departmentsIds) {
        this.departmentsIds = departmentsIds;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getXmppUsername() {
        return xmppUsername;
    }

    public void setXmppUsername(String xmppUsername) {
        this.xmppUsername = xmppUsername;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isHideOnline() {
        return hideOnline;
    }

    public void setHideOnline(boolean hideOnline) {
        this.hideOnline = hideOnline;
    }

    public boolean isAllDepartments() {
        return allDepartments;
    }

    public void setAllDepartments(boolean allDepartments) {
        this.allDepartments = allDepartments;
    }

    public boolean isInvisibleMode() {
        return invisibleMode;
    }

    public void setInvisibleMode(boolean invisibleMode) {
        this.invisibleMode = invisibleMode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public int getRecPerReq() {
        return recPerReq;
    }

    public void setRecPerReq(int recPerReq) {
        this.recPerReq = recPerReq;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getChatNickname() {
        return chatNickname;
    }

    public void setChatNickname(String chatNickname) {
        this.chatNickname = chatNickname;
    }

    public String getOperationAdmin() {
        return operationAdmin;
    }

    public void setOperationAdmin(String operationAdmin) {
        this.operationAdmin = operationAdmin;
    }

    public boolean isInactiveMode() {
        return inactiveMode;
    }

    public void setInactiveMode(boolean inactiveMode) {
        this.inactiveMode = inactiveMode;
    }

    public int getMaxActiveChats() {
        return maxActiveChats;
    }

    public void setMaxActiveChats(int maxActiveChats) {
        this.maxActiveChats = maxActiveChats;
    }

    public boolean isAutoAccept() {
        return autoAccept;
    }

    public void setAutoAccept(boolean autoAccept) {
        this.autoAccept = autoAccept;
    }

    public boolean isExcludeAutoasign() {
        return excludeAutoasign;
    }

    public void setExcludeAutoasign(boolean excludeAutoasign) {
        this.excludeAutoasign = excludeAutoasign;
    }

    public long getPswdUpdated() {
        return pswdUpdated;
    }

    public void setPswdUpdated(long pswdUpdated) {
        this.pswdUpdated = pswdUpdated;
    }

    public boolean isAlwaysOn() {
        return alwaysOn;
    }

    public void setAlwaysOn(boolean alwaysOn) {
        this.alwaysOn = alwaysOn;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getAttrInt1() {
        return attrInt1;
    }

    public void setAttrInt1(int attrInt1) {
        this.attrInt1 = attrInt1;
    }

    public int getAttrInt2() {
        return attrInt2;
    }

    public void setAttrInt2(int attrInt2) {
        this.attrInt2 = attrInt2;
    }

    public int getAttrInt3() {
        return attrInt3;
    }

    public void setAttrInt3(int attrInt3) {
        this.attrInt3 = attrInt3;
    }

    public String getPasswordTemp1() {
        return passwordTemp1;
    }

    public void setPasswordTemp1(String passwordTemp1) {
        this.passwordTemp1 = passwordTemp1;
    }

    public String getPasswordFront() {
        return passwordFront;
    }

    public void setPasswordFront(String passwordFront) {
        this.passwordFront = passwordFront;
    }

    public List<Integer> getUserGroupsId() {
        return userGroupsId;
    }

    public void setUserGroupsId(List<Integer> userGroupsId) {
        this.userGroupsId = userGroupsId;
    }

    public List<Integer> getDepartmentGroups() {
        return departmentGroups;
    }

    public void setDepartmentGroups(List<Integer> departmentGroups) {
        this.departmentGroups = departmentGroups;
    }

    public List<Integer> getDepartmentsIdsReadArray() {
        return departmentsIdsReadArray;
    }

    public void setDepartmentsIdsReadArray(List<Integer> departmentsIdsReadArray) {
        this.departmentsIdsReadArray = departmentsIdsReadArray;
    }

    public List<Integer> getDepartmentsIdsArray() {
        return departmentsIdsArray;
    }

    public void setDepartmentsIdsArray(List<Integer> departmentsIdsArray) {
        this.departmentsIdsArray = departmentsIdsArray;
    }*/
}
