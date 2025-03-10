package com.ajwalker.constants;

public class RestApis {

    private static final String VERSION = "/v1";
    private static final String DEVELOPER = "/dev";
    private static final String ROOT = VERSION+ DEVELOPER;

    public static final String USER = ROOT+"/user";
    public static final String SEAT = ROOT+"/seat";
    public static final String MOVIE = ROOT+"/movie";
    public static final String MOVIESESSION = ROOT+ "/movie-session";
    public static final String CINEMA = ROOT+ "/cinema";
    public static final String SESSION = ROOT+ "/session";

    public static final String LOGIN = "/login";
    public static final String REGISTER = "/register";
    public static final String AUTHMAIL = "/auth-mail";

    public static final String FINDALLMOVIE = "/movie-list";
    public static final String FINDBYIDMOVIE= "/movie-page";
    public static final String GETALLCINEMA = "/get-all-cinema";
    public static final String FINDSESSIONSBYCINEMAID = "/find-sessions-by-cinema-id";

}