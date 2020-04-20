package com.example.demo.vo;

/**
 * @Date 2020/4/20 13:52
 * @Author 86131
 * @Description
 */
public class MessageInfo {
    private String id;
    private String communicationType;
    private String communicationAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommunicationType() {
        return communicationType;
    }

    public void setCommunicationType(String communicationType) {
        this.communicationType = communicationType;
    }

    public String getCommunicationAddress() {
        return communicationAddress;
    }

    public void setCommunicationAddress(String communicationAddress) {
        this.communicationAddress = communicationAddress;
    }
}
