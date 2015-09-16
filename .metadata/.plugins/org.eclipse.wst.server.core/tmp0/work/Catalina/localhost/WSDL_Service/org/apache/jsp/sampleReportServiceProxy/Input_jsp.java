package org.apache.jsp.sampleReportServiceProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Input_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Inputs</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Inputs</H1>\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 5:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">endpoint:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"endpoint8\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 10:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 13:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">in0:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showTabs:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showTabs206\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">dashboardTabId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"dashboardTabId208\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">multiChartEnabled:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"multiChartEnabled210\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportUserId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"reportUserId212\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"reportId214\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">absoluteTableWidth:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"absoluteTableWidth216\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">languageCode:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"languageCode218\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showTimeSlider:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showTimeSlider220\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportUserPassword:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"reportUserPassword222\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showTitle:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showTitle224\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showPageSelection:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showPageSelection226\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showLinks:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showLinks228\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">drillAnywhereUniqueValueName:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"drillAnywhereUniqueValueName230\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showSeriesSelection:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showSeriesSelection232\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">fitTableWidth:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"fitTableWidth234\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showAlerts:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showAlerts236\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">chartWidth:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"chartWidth238\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">binaryURL:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"binaryURL240\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">imageURL:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"imageURL242\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showDrillDownStack:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showDrillDownStack244\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportBroadcastSubject:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"reportBroadcastSubject246\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">schedule:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">advancedTime:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"advancedTime250\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">advancedTimezoneCode:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"advancedTimezoneCode252\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">frequencyUnit:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"frequencyUnit254\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">frequencyCode:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"frequencyCode256\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">recipient:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"recipient258\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">subject:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"subject260\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">frequencyTypeCode:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"frequencyTypeCode262\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">format:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"format264\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">bodyText:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"bodyText266\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">activeCharts:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"activeCharts268\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showCoDisplay:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showCoDisplay270\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportComment:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">parentCommentId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"parentCommentId274\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">commentDate:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"commentDate276\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">author:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"author278\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">statusCode:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"statusCode280\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">comment:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"comment282\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">lastActivityDate:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"lastActivityDate284\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">commentId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"commentId286\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">authorId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"authorId288\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">reportId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"reportId290\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">title:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"title292\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">singlePage:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"singlePage294\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">multiReportTag:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"multiReportTag296\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportBroadcastContent:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"reportBroadcastContent298\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">alterationCommand:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"alterationCommand300\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">orgId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"orgId302\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">password:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"password304\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">sortColumn:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"sortColumn306\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">dataFormattingOptionsType:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"dataFormattingOptionsType308\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">gisNavigation:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"gisNavigation310\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showDrillThroughStack:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showDrillThroughStack312\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showAlertImages:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showAlertImages314\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showSort:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showSort316\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">sessionId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"sessionId318\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">orgRef:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"orgRef320\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">showCharts:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"showCharts322\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">linkFormatterClass:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"linkFormatterClass324\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">objectName:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"objectName326\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">loginId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"loginId328\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">chartPlacementCode:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"chartPlacementCode330\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">imageType:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"imageType332\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">linkURL:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"linkURL334\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">distributionText:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"distributionText336\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">chartHeight:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"chartHeight338\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportClientReferenceId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"reportClientReferenceId340\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportRequest:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"reportRequest342\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">drillAnywhereFieldId:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"drillAnywhereFieldId344\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">drillAnywhereCellValue:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"drillAnywhereCellValue346\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">chartScale:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"chartScale348\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111111:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">URLString:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"url1111111111\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111112:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
}
if (valid) {

      out.write("\r\n");
      out.write("Select a method to test.\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
