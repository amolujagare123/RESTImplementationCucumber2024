package Util;

public enum ChatServerResource {

    createUser("/restapi/user"),
    updateUser("/restapi/user/367");

    String resource;

    ChatServerResource(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
