package com.epam.web.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2019-06-15T14:27:18.552+03:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://soap.web.epam.com/", name = "UserService")
@XmlSeeAlso({ObjectFactory.class})
public interface UserService extends com.epam.web.UserService {

    @WebMethod
    @RequestWrapper(localName = "logIn", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.LogIn")
    @ResponseWrapper(localName = "logInResponse", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.LogInResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean logIn(
        @WebParam(name = "arg0", targetNamespace = "")
        com.epam.web.soap.LoginModel arg0
    ) throws ServiceException;

    @WebMethod
    @RequestWrapper(localName = "getRoles", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.GetRoles")
    @ResponseWrapper(localName = "getRolesResponse", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.GetRolesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.epam.web.soap.Role> getRoles() throws ServiceException;

    @WebMethod
    @RequestWrapper(localName = "removeUser", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.RemoveUser")
    @ResponseWrapper(localName = "removeUserResponse", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.RemoveUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean removeUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.epam.web.soap.User arg0
    ) throws ServiceException;

    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.AddUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.epam.web.soap.User arg0
    ) throws ServiceException;

    @WebMethod
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.GetAllUsers")
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.GetAllUsersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.epam.web.soap.User> getAllUsers();

    @WebMethod
    @RequestWrapper(localName = "getUsersByRole", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.GetUsersByRole")
    @ResponseWrapper(localName = "getUsersByRoleResponse", targetNamespace = "http://soap.web.epam.com/", className = "com.epam.web.soap.GetUsersByRoleResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.epam.web.soap.User> getUsersByRole(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    ) throws ServiceException;
}
