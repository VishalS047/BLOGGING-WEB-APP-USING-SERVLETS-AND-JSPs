
package com.tech.bog.entities;

public class Message 
{

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public Message(String messagecontent, String messagetype, String cssClass) {
        this.messagecontent = messagecontent;
        this.messagetype = messagetype;
        this.cssClass = cssClass;
    }
    private String messagecontent;
    private String messagetype;
    private String cssClass;
}
