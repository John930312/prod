package com.csbr.prod.Utils;

/**
 * Created by YangYuFan on 2019/2/26.
 */
public class SendMessage {
    private Integer Code;
    private String Message;
    private Object data;


    public static SendMessage Success(Object data){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setCode(200);
        sendMessage.setMessage("SUCCESS");
        sendMessage.setData(data);
        return sendMessage;
    }

    public static SendMessage Fail(String message){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setCode(500);
        sendMessage.setMessage(message);
        sendMessage.setData(null);
        return sendMessage;
    }


    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
