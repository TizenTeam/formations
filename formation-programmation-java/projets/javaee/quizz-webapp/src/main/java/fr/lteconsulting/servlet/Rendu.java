package fr.lteconsulting.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.lteconsulting.model.Quizz;

public class Rendu
{
	public static void pageBienvenue( String nomUtilisateur, List<Quizz> quizzs, ServletContext context, HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		request.setAttribute( "nomUtilisateur", nomUtilisateur );
		request.setAttribute( "quizzs", quizzs );

		pagePrincipale( "Bienvenue", "/WEB-INF/accueil.jsp", context, request, response );
	}

	public static void pageLogin( ServletContext context, HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		pagePrincipale( "Bienvenue", "/WEB-INF/login.jsp", context, request, response );
	}

	public static void pagePrincipale( String title, String contentJsp, ServletContext context, HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		request.setAttribute( "pageTitle", title );
		request.setAttribute( "contentJsp", contentJsp );

		RequestDispatcher dispatcher = context.getRequestDispatcher( "/WEB-INF/body.jsp" );

		dispatcher.forward( request, response );
	}
}
