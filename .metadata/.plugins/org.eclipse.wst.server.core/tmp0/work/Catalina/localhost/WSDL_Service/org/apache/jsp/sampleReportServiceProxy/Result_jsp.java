package org.apache.jsp.sampleReportServiceProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Result</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Result</H1>\r\n");
      out.write("\r\n");
      vw_pun_atm_dv60.services.ReportService.ReportServiceProxy sampleReportServiceProxyid = null;
      synchronized (session) {
        sampleReportServiceProxyid = (vw_pun_atm_dv60.services.ReportService.ReportServiceProxy) _jspx_page_context.getAttribute("sampleReportServiceProxyid", PageContext.SESSION_SCOPE);
        if (sampleReportServiceProxyid == null){
          sampleReportServiceProxyid = new vw_pun_atm_dv60.services.ReportService.ReportServiceProxy();
          _jspx_page_context.setAttribute("sampleReportServiceProxyid", sampleReportServiceProxyid, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleReportServiceProxyid.setEndpoint(request.getParameter("endpoint"));

      out.write("\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleReportServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getEndpoint2mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp3 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleReportServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        vw_pun_atm_dv60.services.ReportService.ReportService getReportService10mtemp = sampleReportServiceProxyid.getReportService();
if(getReportService10mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getReportService10mtemp );
      out.write('\r');
      out.write('\n');

}else{
        if(getReportService10mtemp!= null){
        String tempreturnp11 = getReportService10mtemp.toString();
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreturnp11);
      out.write("\r\n");
      out.write("        ");

        }}
break;
case 13:
        gotMethod = true;
        String showTabs_2id=  request.getParameter("showTabs206");
        boolean showTabs_2idTemp  = Boolean.valueOf(showTabs_2id).booleanValue();
        String dashboardTabId_3id=  request.getParameter("dashboardTabId208");
            java.lang.Integer dashboardTabId_3idTemp = null;
        if(!dashboardTabId_3id.equals("")){
         dashboardTabId_3idTemp  = java.lang.Integer.valueOf(dashboardTabId_3id);
        }
        String multiChartEnabled_4id=  request.getParameter("multiChartEnabled210");
        boolean multiChartEnabled_4idTemp  = Boolean.valueOf(multiChartEnabled_4id).booleanValue();
        String reportUserId_5id=  request.getParameter("reportUserId212");
            java.lang.String reportUserId_5idTemp = null;
        if(!reportUserId_5id.equals("")){
         reportUserId_5idTemp  = reportUserId_5id;
        }
        String reportId_6id=  request.getParameter("reportId214");
            java.lang.Integer reportId_6idTemp = null;
        if(!reportId_6id.equals("")){
         reportId_6idTemp  = java.lang.Integer.valueOf(reportId_6id);
        }
        String absoluteTableWidth_7id=  request.getParameter("absoluteTableWidth216");
            java.lang.Integer absoluteTableWidth_7idTemp = null;
        if(!absoluteTableWidth_7id.equals("")){
         absoluteTableWidth_7idTemp  = java.lang.Integer.valueOf(absoluteTableWidth_7id);
        }
        String languageCode_8id=  request.getParameter("languageCode218");
            java.lang.String languageCode_8idTemp = null;
        if(!languageCode_8id.equals("")){
         languageCode_8idTemp  = languageCode_8id;
        }
        String showTimeSlider_9id=  request.getParameter("showTimeSlider220");
        boolean showTimeSlider_9idTemp  = Boolean.valueOf(showTimeSlider_9id).booleanValue();
        String reportUserPassword_10id=  request.getParameter("reportUserPassword222");
            java.lang.String reportUserPassword_10idTemp = null;
        if(!reportUserPassword_10id.equals("")){
         reportUserPassword_10idTemp  = reportUserPassword_10id;
        }
        String showTitle_11id=  request.getParameter("showTitle224");
        boolean showTitle_11idTemp  = Boolean.valueOf(showTitle_11id).booleanValue();
        String showPageSelection_12id=  request.getParameter("showPageSelection226");
        boolean showPageSelection_12idTemp  = Boolean.valueOf(showPageSelection_12id).booleanValue();
        String showLinks_13id=  request.getParameter("showLinks228");
        boolean showLinks_13idTemp  = Boolean.valueOf(showLinks_13id).booleanValue();
        String drillAnywhereUniqueValueName_14id=  request.getParameter("drillAnywhereUniqueValueName230");
            java.lang.String drillAnywhereUniqueValueName_14idTemp = null;
        if(!drillAnywhereUniqueValueName_14id.equals("")){
         drillAnywhereUniqueValueName_14idTemp  = drillAnywhereUniqueValueName_14id;
        }
        String showSeriesSelection_15id=  request.getParameter("showSeriesSelection232");
        boolean showSeriesSelection_15idTemp  = Boolean.valueOf(showSeriesSelection_15id).booleanValue();
        String fitTableWidth_16id=  request.getParameter("fitTableWidth234");
            java.lang.Boolean fitTableWidth_16idTemp = null;
        if(!fitTableWidth_16id.equals("")){
         fitTableWidth_16idTemp  = java.lang.Boolean.valueOf(fitTableWidth_16id);
        }
        String showAlerts_17id=  request.getParameter("showAlerts236");
        boolean showAlerts_17idTemp  = Boolean.valueOf(showAlerts_17id).booleanValue();
        String chartWidth_18id=  request.getParameter("chartWidth238");
            java.lang.Integer chartWidth_18idTemp = null;
        if(!chartWidth_18id.equals("")){
         chartWidth_18idTemp  = java.lang.Integer.valueOf(chartWidth_18id);
        }
        String binaryURL_19id=  request.getParameter("binaryURL240");
            java.lang.String binaryURL_19idTemp = null;
        if(!binaryURL_19id.equals("")){
         binaryURL_19idTemp  = binaryURL_19id;
        }
        String imageURL_20id=  request.getParameter("imageURL242");
            java.lang.String imageURL_20idTemp = null;
        if(!imageURL_20id.equals("")){
         imageURL_20idTemp  = imageURL_20id;
        }
        String showDrillDownStack_21id=  request.getParameter("showDrillDownStack244");
        boolean showDrillDownStack_21idTemp  = Boolean.valueOf(showDrillDownStack_21id).booleanValue();
        String reportBroadcastSubject_22id=  request.getParameter("reportBroadcastSubject246");
            java.lang.String reportBroadcastSubject_22idTemp = null;
        if(!reportBroadcastSubject_22id.equals("")){
         reportBroadcastSubject_22idTemp  = reportBroadcastSubject_22id;
        }
        String advancedTime_24id=  request.getParameter("advancedTime250");
            java.lang.Integer advancedTime_24idTemp = null;
        if(!advancedTime_24id.equals("")){
         advancedTime_24idTemp  = java.lang.Integer.valueOf(advancedTime_24id);
        }
        String advancedTimezoneCode_25id=  request.getParameter("advancedTimezoneCode252");
            java.lang.String advancedTimezoneCode_25idTemp = null;
        if(!advancedTimezoneCode_25id.equals("")){
         advancedTimezoneCode_25idTemp  = advancedTimezoneCode_25id;
        }
        String frequencyUnit_26id=  request.getParameter("frequencyUnit254");
            java.lang.Integer frequencyUnit_26idTemp = null;
        if(!frequencyUnit_26id.equals("")){
         frequencyUnit_26idTemp  = java.lang.Integer.valueOf(frequencyUnit_26id);
        }
        String frequencyCode_27id=  request.getParameter("frequencyCode256");
            java.lang.String frequencyCode_27idTemp = null;
        if(!frequencyCode_27id.equals("")){
         frequencyCode_27idTemp  = frequencyCode_27id;
        }
        String recipient_28id=  request.getParameter("recipient258");
            java.lang.Integer recipient_28idTemp = null;
        if(!recipient_28id.equals("")){
         recipient_28idTemp  = java.lang.Integer.valueOf(recipient_28id);
        }
        String subject_29id=  request.getParameter("subject260");
            java.lang.String subject_29idTemp = null;
        if(!subject_29id.equals("")){
         subject_29idTemp  = subject_29id;
        }
        String frequencyTypeCode_30id=  request.getParameter("frequencyTypeCode262");
            java.lang.String frequencyTypeCode_30idTemp = null;
        if(!frequencyTypeCode_30id.equals("")){
         frequencyTypeCode_30idTemp  = frequencyTypeCode_30id;
        }
        String format_31id=  request.getParameter("format264");
            java.lang.String format_31idTemp = null;
        if(!format_31id.equals("")){
         format_31idTemp  = format_31id;
        }
        String bodyText_32id=  request.getParameter("bodyText266");
            java.lang.String bodyText_32idTemp = null;
        if(!bodyText_32id.equals("")){
         bodyText_32idTemp  = bodyText_32id;
        }
        
      out.write("\r\n");
      out.write("        ");
      com.hof.mi.web.service.ScheduleRecord com1hof1mi1web1service1ScheduleRecord_23id = null;
      synchronized (session) {
        com1hof1mi1web1service1ScheduleRecord_23id = (com.hof.mi.web.service.ScheduleRecord) _jspx_page_context.getAttribute("com1hof1mi1web1service1ScheduleRecord_23id", PageContext.SESSION_SCOPE);
        if (com1hof1mi1web1service1ScheduleRecord_23id == null){
          com1hof1mi1web1service1ScheduleRecord_23id = new com.hof.mi.web.service.ScheduleRecord();
          _jspx_page_context.setAttribute("com1hof1mi1web1service1ScheduleRecord_23id", com1hof1mi1web1service1ScheduleRecord_23id, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");

        com1hof1mi1web1service1ScheduleRecord_23id.setAdvancedTime(advancedTime_24idTemp);
        com1hof1mi1web1service1ScheduleRecord_23id.setAdvancedTimezoneCode(advancedTimezoneCode_25idTemp);
        com1hof1mi1web1service1ScheduleRecord_23id.setFrequencyUnit(frequencyUnit_26idTemp);
        com1hof1mi1web1service1ScheduleRecord_23id.setFrequencyCode(frequencyCode_27idTemp);
        com1hof1mi1web1service1ScheduleRecord_23id.setRecipient(recipient_28idTemp);
        com1hof1mi1web1service1ScheduleRecord_23id.setSubject(subject_29idTemp);
        com1hof1mi1web1service1ScheduleRecord_23id.setFrequencyTypeCode(frequencyTypeCode_30idTemp);
        com1hof1mi1web1service1ScheduleRecord_23id.setFormat(format_31idTemp);
        com1hof1mi1web1service1ScheduleRecord_23id.setBodyText(bodyText_32idTemp);
        String activeCharts_33id=  request.getParameter("activeCharts268");
        boolean activeCharts_33idTemp  = Boolean.valueOf(activeCharts_33id).booleanValue();
        String showCoDisplay_34id=  request.getParameter("showCoDisplay270");
        boolean showCoDisplay_34idTemp  = Boolean.valueOf(showCoDisplay_34id).booleanValue();
        String parentCommentId_36id=  request.getParameter("parentCommentId274");
            java.lang.Integer parentCommentId_36idTemp = null;
        if(!parentCommentId_36id.equals("")){
         parentCommentId_36idTemp  = java.lang.Integer.valueOf(parentCommentId_36id);
        }
        String commentDate_37id=  request.getParameter("commentDate276");
            java.lang.String commentDate_37idTemp = null;
        if(!commentDate_37id.equals("")){
         commentDate_37idTemp  = commentDate_37id;
        }
        String author_38id=  request.getParameter("author278");
            java.lang.String author_38idTemp = null;
        if(!author_38id.equals("")){
         author_38idTemp  = author_38id;
        }
        String statusCode_39id=  request.getParameter("statusCode280");
            java.lang.String statusCode_39idTemp = null;
        if(!statusCode_39id.equals("")){
         statusCode_39idTemp  = statusCode_39id;
        }
        String comment_40id=  request.getParameter("comment282");
            java.lang.String comment_40idTemp = null;
        if(!comment_40id.equals("")){
         comment_40idTemp  = comment_40id;
        }
        String lastActivityDate_41id=  request.getParameter("lastActivityDate284");
            java.lang.String lastActivityDate_41idTemp = null;
        if(!lastActivityDate_41id.equals("")){
         lastActivityDate_41idTemp  = lastActivityDate_41id;
        }
        String commentId_42id=  request.getParameter("commentId286");
            java.lang.Integer commentId_42idTemp = null;
        if(!commentId_42id.equals("")){
         commentId_42idTemp  = java.lang.Integer.valueOf(commentId_42id);
        }
        String authorId_43id=  request.getParameter("authorId288");
            java.lang.Integer authorId_43idTemp = null;
        if(!authorId_43id.equals("")){
         authorId_43idTemp  = java.lang.Integer.valueOf(authorId_43id);
        }
        String reportId_44id=  request.getParameter("reportId290");
            java.lang.Integer reportId_44idTemp = null;
        if(!reportId_44id.equals("")){
         reportId_44idTemp  = java.lang.Integer.valueOf(reportId_44id);
        }
        String title_45id=  request.getParameter("title292");
            java.lang.String title_45idTemp = null;
        if(!title_45id.equals("")){
         title_45idTemp  = title_45id;
        }
        
      out.write("\r\n");
      out.write("        ");
      com.hof.mi.web.service.ReportComment com1hof1mi1web1service1ReportComment_35id = null;
      synchronized (session) {
        com1hof1mi1web1service1ReportComment_35id = (com.hof.mi.web.service.ReportComment) _jspx_page_context.getAttribute("com1hof1mi1web1service1ReportComment_35id", PageContext.SESSION_SCOPE);
        if (com1hof1mi1web1service1ReportComment_35id == null){
          com1hof1mi1web1service1ReportComment_35id = new com.hof.mi.web.service.ReportComment();
          _jspx_page_context.setAttribute("com1hof1mi1web1service1ReportComment_35id", com1hof1mi1web1service1ReportComment_35id, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");

        com1hof1mi1web1service1ReportComment_35id.setParentCommentId(parentCommentId_36idTemp);
        com1hof1mi1web1service1ReportComment_35id.setCommentDate(commentDate_37idTemp);
        com1hof1mi1web1service1ReportComment_35id.setAuthor(author_38idTemp);
        com1hof1mi1web1service1ReportComment_35id.setStatusCode(statusCode_39idTemp);
        com1hof1mi1web1service1ReportComment_35id.setComment(comment_40idTemp);
        com1hof1mi1web1service1ReportComment_35id.setLastActivityDate(lastActivityDate_41idTemp);
        com1hof1mi1web1service1ReportComment_35id.setCommentId(commentId_42idTemp);
        com1hof1mi1web1service1ReportComment_35id.setAuthorId(authorId_43idTemp);
        com1hof1mi1web1service1ReportComment_35id.setReportId(reportId_44idTemp);
        com1hof1mi1web1service1ReportComment_35id.setTitle(title_45idTemp);
        String singlePage_46id=  request.getParameter("singlePage294");
        boolean singlePage_46idTemp  = Boolean.valueOf(singlePage_46id).booleanValue();
        String multiReportTag_47id=  request.getParameter("multiReportTag296");
            java.lang.String multiReportTag_47idTemp = null;
        if(!multiReportTag_47id.equals("")){
         multiReportTag_47idTemp  = multiReportTag_47id;
        }
        String reportBroadcastContent_48id=  request.getParameter("reportBroadcastContent298");
            java.lang.String reportBroadcastContent_48idTemp = null;
        if(!reportBroadcastContent_48id.equals("")){
         reportBroadcastContent_48idTemp  = reportBroadcastContent_48id;
        }
        String alterationCommand_49id=  request.getParameter("alterationCommand300");
            java.lang.String alterationCommand_49idTemp = null;
        if(!alterationCommand_49id.equals("")){
         alterationCommand_49idTemp  = alterationCommand_49id;
        }
        String orgId_50id=  request.getParameter("orgId302");
            java.lang.Integer orgId_50idTemp = null;
        if(!orgId_50id.equals("")){
         orgId_50idTemp  = java.lang.Integer.valueOf(orgId_50id);
        }
        String password_51id=  request.getParameter("password304");
            java.lang.String password_51idTemp = null;
        if(!password_51id.equals("")){
         password_51idTemp  = password_51id;
        }
        String sortColumn_52id=  request.getParameter("sortColumn306");
            java.lang.Integer sortColumn_52idTemp = null;
        if(!sortColumn_52id.equals("")){
         sortColumn_52idTemp  = java.lang.Integer.valueOf(sortColumn_52id);
        }
        String dataFormattingOptionsType_53id=  request.getParameter("dataFormattingOptionsType308");
            java.lang.String dataFormattingOptionsType_53idTemp = null;
        if(!dataFormattingOptionsType_53id.equals("")){
         dataFormattingOptionsType_53idTemp  = dataFormattingOptionsType_53id;
        }
        String gisNavigation_54id=  request.getParameter("gisNavigation310");
        boolean gisNavigation_54idTemp  = Boolean.valueOf(gisNavigation_54id).booleanValue();
        String showDrillThroughStack_55id=  request.getParameter("showDrillThroughStack312");
        boolean showDrillThroughStack_55idTemp  = Boolean.valueOf(showDrillThroughStack_55id).booleanValue();
        String showAlertImages_56id=  request.getParameter("showAlertImages314");
        boolean showAlertImages_56idTemp  = Boolean.valueOf(showAlertImages_56id).booleanValue();
        String showSort_57id=  request.getParameter("showSort316");
        boolean showSort_57idTemp  = Boolean.valueOf(showSort_57id).booleanValue();
        String sessionId_58id=  request.getParameter("sessionId318");
            java.lang.String sessionId_58idTemp = null;
        if(!sessionId_58id.equals("")){
         sessionId_58idTemp  = sessionId_58id;
        }
        String orgRef_59id=  request.getParameter("orgRef320");
            java.lang.String orgRef_59idTemp = null;
        if(!orgRef_59id.equals("")){
         orgRef_59idTemp  = orgRef_59id;
        }
        String showCharts_60id=  request.getParameter("showCharts322");
        boolean showCharts_60idTemp  = Boolean.valueOf(showCharts_60id).booleanValue();
        String linkFormatterClass_61id=  request.getParameter("linkFormatterClass324");
            java.lang.String linkFormatterClass_61idTemp = null;
        if(!linkFormatterClass_61id.equals("")){
         linkFormatterClass_61idTemp  = linkFormatterClass_61id;
        }
        String objectName_62id=  request.getParameter("objectName326");
            java.lang.String objectName_62idTemp = null;
        if(!objectName_62id.equals("")){
         objectName_62idTemp  = objectName_62id;
        }
        String loginId_63id=  request.getParameter("loginId328");
            java.lang.String loginId_63idTemp = null;
        if(!loginId_63id.equals("")){
         loginId_63idTemp  = loginId_63id;
        }
        String chartPlacementCode_64id=  request.getParameter("chartPlacementCode330");
            java.lang.String chartPlacementCode_64idTemp = null;
        if(!chartPlacementCode_64id.equals("")){
         chartPlacementCode_64idTemp  = chartPlacementCode_64id;
        }
        String imageType_65id=  request.getParameter("imageType332");
            java.lang.String imageType_65idTemp = null;
        if(!imageType_65id.equals("")){
         imageType_65idTemp  = imageType_65id;
        }
        String linkURL_66id=  request.getParameter("linkURL334");
            java.lang.String linkURL_66idTemp = null;
        if(!linkURL_66id.equals("")){
         linkURL_66idTemp  = linkURL_66id;
        }
        String distributionText_67id=  request.getParameter("distributionText336");
            java.lang.String distributionText_67idTemp = null;
        if(!distributionText_67id.equals("")){
         distributionText_67idTemp  = distributionText_67id;
        }
        String chartHeight_68id=  request.getParameter("chartHeight338");
            java.lang.Integer chartHeight_68idTemp = null;
        if(!chartHeight_68id.equals("")){
         chartHeight_68idTemp  = java.lang.Integer.valueOf(chartHeight_68id);
        }
        String reportClientReferenceId_69id=  request.getParameter("reportClientReferenceId340");
            java.lang.String reportClientReferenceId_69idTemp = null;
        if(!reportClientReferenceId_69id.equals("")){
         reportClientReferenceId_69idTemp  = reportClientReferenceId_69id;
        }
        String reportRequest_70id=  request.getParameter("reportRequest342");
            java.lang.String reportRequest_70idTemp = null;
        if(!reportRequest_70id.equals("")){
         reportRequest_70idTemp  = reportRequest_70id;
        }
        String drillAnywhereFieldId_71id=  request.getParameter("drillAnywhereFieldId344");
            java.lang.Integer drillAnywhereFieldId_71idTemp = null;
        if(!drillAnywhereFieldId_71id.equals("")){
         drillAnywhereFieldId_71idTemp  = java.lang.Integer.valueOf(drillAnywhereFieldId_71id);
        }
        String drillAnywhereCellValue_72id=  request.getParameter("drillAnywhereCellValue346");
            java.lang.String drillAnywhereCellValue_72idTemp = null;
        if(!drillAnywhereCellValue_72id.equals("")){
         drillAnywhereCellValue_72idTemp  = drillAnywhereCellValue_72id;
        }
        String chartScale_73id=  request.getParameter("chartScale348");
            java.lang.Integer chartScale_73idTemp = null;
        if(!chartScale_73id.equals("")){
         chartScale_73idTemp  = java.lang.Integer.valueOf(chartScale_73id);
        }
        
      out.write("\r\n");
      out.write("        ");
      com.hof.mi.web.service.ReportServiceRequest com1hof1mi1web1service1ReportServiceRequest_1id = null;
      synchronized (session) {
        com1hof1mi1web1service1ReportServiceRequest_1id = (com.hof.mi.web.service.ReportServiceRequest) _jspx_page_context.getAttribute("com1hof1mi1web1service1ReportServiceRequest_1id", PageContext.SESSION_SCOPE);
        if (com1hof1mi1web1service1ReportServiceRequest_1id == null){
          com1hof1mi1web1service1ReportServiceRequest_1id = new com.hof.mi.web.service.ReportServiceRequest();
          _jspx_page_context.setAttribute("com1hof1mi1web1service1ReportServiceRequest_1id", com1hof1mi1web1service1ReportServiceRequest_1id, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");

        com1hof1mi1web1service1ReportServiceRequest_1id.setShowTabs(showTabs_2idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setDashboardTabId(dashboardTabId_3idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setMultiChartEnabled(multiChartEnabled_4idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setReportUserId(reportUserId_5idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setReportId(reportId_6idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setAbsoluteTableWidth(absoluteTableWidth_7idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setLanguageCode(languageCode_8idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowTimeSlider(showTimeSlider_9idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setReportUserPassword(reportUserPassword_10idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowTitle(showTitle_11idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowPageSelection(showPageSelection_12idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowLinks(showLinks_13idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setDrillAnywhereUniqueValueName(drillAnywhereUniqueValueName_14idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowSeriesSelection(showSeriesSelection_15idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setFitTableWidth(fitTableWidth_16idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowAlerts(showAlerts_17idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setChartWidth(chartWidth_18idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setBinaryURL(binaryURL_19idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setImageURL(imageURL_20idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowDrillDownStack(showDrillDownStack_21idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setReportBroadcastSubject(reportBroadcastSubject_22idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setSchedule(com1hof1mi1web1service1ScheduleRecord_23id);
        com1hof1mi1web1service1ReportServiceRequest_1id.setActiveCharts(activeCharts_33idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowCoDisplay(showCoDisplay_34idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setReportComment(com1hof1mi1web1service1ReportComment_35id);
        com1hof1mi1web1service1ReportServiceRequest_1id.setSinglePage(singlePage_46idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setMultiReportTag(multiReportTag_47idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setReportBroadcastContent(reportBroadcastContent_48idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setAlterationCommand(alterationCommand_49idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setOrgId(orgId_50idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setPassword(password_51idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setSortColumn(sortColumn_52idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setDataFormattingOptionsType(dataFormattingOptionsType_53idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setGisNavigation(gisNavigation_54idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowDrillThroughStack(showDrillThroughStack_55idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowAlertImages(showAlertImages_56idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowSort(showSort_57idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setSessionId(sessionId_58idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setOrgRef(orgRef_59idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setShowCharts(showCharts_60idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setLinkFormatterClass(linkFormatterClass_61idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setObjectName(objectName_62idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setLoginId(loginId_63idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setChartPlacementCode(chartPlacementCode_64idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setImageType(imageType_65idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setLinkURL(linkURL_66idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setDistributionText(distributionText_67idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setChartHeight(chartHeight_68idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setReportClientReferenceId(reportClientReferenceId_69idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setReportRequest(reportRequest_70idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setDrillAnywhereFieldId(drillAnywhereFieldId_71idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setDrillAnywhereCellValue(drillAnywhereCellValue_72idTemp);
        com1hof1mi1web1service1ReportServiceRequest_1id.setChartScale(chartScale_73idTemp);
        com.hof.mi.web.service.ReportServiceResponse remoteReportCall13mtemp = sampleReportServiceProxyid.remoteReportCall(com1hof1mi1web1service1ReportServiceRequest_1id);
if(remoteReportCall13mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(remoteReportCall13mtemp );
      out.write('\r');
      out.write('\n');

}else{

      out.write("\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">returnp:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">statusCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typestatusCode16 = remoteReportCall13mtemp.getStatusCode();
        String tempResultstatusCode16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatusCode16));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultstatusCode16 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportId:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typereportId18 = remoteReportCall13mtemp.getReportId();
        String tempResultreportId18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportId18));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportId18 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">_private:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Boolean type_private20 = remoteReportCall13mtemp.get_private();
        String tempResult_private20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(type_private20));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResult_private20 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportDescription:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typereportDescription22 = remoteReportCall13mtemp.getReportDescription();
        String tempResultreportDescription22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportDescription22));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportDescription22 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">comments:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ReportComment[] typecomments24 = remoteReportCall13mtemp.getComments();
        String tempcomments24 = null;
        if(typecomments24 != null){
        java.util.List listcomments24= java.util.Arrays.asList(typecomments24);
        tempcomments24 = listcomments24.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempcomments24);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">seriesSelection:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.SeriesSelection[] typeseriesSelection26 = remoteReportCall13mtemp.getSeriesSelection();
        String tempseriesSelection26 = null;
        if(typeseriesSelection26 != null){
        java.util.List listseriesSelection26= java.util.Arrays.asList(typeseriesSelection26);
        tempseriesSelection26 = listseriesSelection26.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempseriesSelection26);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">dashboardEnabled:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){

      out.write('\r');
      out.write('\n');
      out.print(remoteReportCall13mtemp.isDashboardEnabled()
);
}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportTabSelection:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ReportTabSelection[] typereportTabSelection30 = remoteReportCall13mtemp.getReportTabSelection();
        String tempreportTabSelection30 = null;
        if(typereportTabSelection30 != null){
        java.util.List listreportTabSelection30= java.util.Arrays.asList(typereportTabSelection30);
        tempreportTabSelection30 = listreportTabSelection30.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreportTabSelection30);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">selectedSortColumn:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typeselectedSortColumn32 = remoteReportCall13mtemp.getSelectedSortColumn();
        String tempResultselectedSortColumn32 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeselectedSortColumn32));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultselectedSortColumn32 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">charts:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ReportChart[] typecharts34 = remoteReportCall13mtemp.getCharts();
        String tempcharts34 = null;
        if(typecharts34 != null){
        java.util.List listcharts34= java.util.Arrays.asList(typecharts34);
        tempcharts34 = listcharts34.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempcharts34);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">category:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typecategory36 = remoteReportCall13mtemp.getCategory();
        String tempResultcategory36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecategory36));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultcategory36 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">binaryObjects:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ReportBinaryObject[] typebinaryObjects38 = remoteReportCall13mtemp.getBinaryObjects();
        String tempbinaryObjects38 = null;
        if(typebinaryObjects38 != null){
        java.util.List listbinaryObjects38= java.util.Arrays.asList(typebinaryObjects38);
        tempbinaryObjects38 = listbinaryObjects38.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempbinaryObjects38);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">author:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typeauthor40 = remoteReportCall13mtemp.getAuthor();
        String tempResultauthor40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeauthor40));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultauthor40 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">viewName:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typeviewName42 = remoteReportCall13mtemp.getViewName();
        String tempResultviewName42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeviewName42));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultviewName42 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportPageSelection:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ReportPageSelection[] typereportPageSelection44 = remoteReportCall13mtemp.getReportPageSelection();
        String tempreportPageSelection44 = null;
        if(typereportPageSelection44 != null){
        java.util.List listreportPageSelection44= java.util.Arrays.asList(typereportPageSelection44);
        tempreportPageSelection44 = listreportPageSelection44.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreportPageSelection44);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">timeAggregationSelection:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
vw_pun_atm_dv60.services.ReportService.TimeAggregationSelection[] typetimeAggregationSelection46 = remoteReportCall13mtemp.getTimeAggregationSelection();
        String temptimeAggregationSelection46 = null;
        if(typetimeAggregationSelection46 != null){
        java.util.List listtimeAggregationSelection46= java.util.Arrays.asList(typetimeAggregationSelection46);
        temptimeAggregationSelection46 = listtimeAggregationSelection46.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(temptimeAggregationSelection46);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportFilters:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ReportFilter[] typereportFilters48 = remoteReportCall13mtemp.getReportFilters();
        String tempreportFilters48 = null;
        if(typereportFilters48 != null){
        java.util.List listreportFilters48= java.util.Arrays.asList(typereportFilters48);
        tempreportFilters48 = listreportFilters48.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreportFilters48);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">columns:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ReportSchema[] typecolumns50 = remoteReportCall13mtemp.getColumns();
        String tempcolumns50 = null;
        if(typecolumns50 != null){
        java.util.List listcolumns50= java.util.Arrays.asList(typecolumns50);
        tempcolumns50 = listcolumns50.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempcolumns50);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">errorCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typeerrorCode52 = remoteReportCall13mtemp.getErrorCode();
        String tempResulterrorCode52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorCode52));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResulterrorCode52 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportUUID:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typereportUUID54 = remoteReportCall13mtemp.getReportUUID();
        String tempResultreportUUID54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportUUID54));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportUUID54 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportUsage:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typereportUsage56 = remoteReportCall13mtemp.getReportUsage();
        String tempResultreportUsage56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportUsage56));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportUsage56 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">googleMaps:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.GMap[] typegoogleMaps58 = remoteReportCall13mtemp.getGoogleMaps();
        String tempgoogleMaps58 = null;
        if(typegoogleMaps58 != null){
        java.util.List listgoogleMaps58= java.util.Arrays.asList(typegoogleMaps58);
        tempgoogleMaps58 = listgoogleMaps58.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempgoogleMaps58);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">contentType:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typecontentType60 = remoteReportCall13mtemp.getContentType();
        String tempResultcontentType60 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecontentType60));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultcontentType60 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">timeSliderSelection:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.TimeSliderSelection[] typetimeSliderSelection62 = remoteReportCall13mtemp.getTimeSliderSelection();
        String temptimeSliderSelection62 = null;
        if(typetimeSliderSelection62 != null){
        java.util.List listtimeSliderSelection62= java.util.Arrays.asList(typetimeSliderSelection62);
        temptimeSliderSelection62 = listtimeSliderSelection62.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(temptimeSliderSelection62);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">messages:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String[] typemessages64 = remoteReportCall13mtemp.getMessages();
        String tempmessages64 = null;
        if(typemessages64 != null){
        java.util.List listmessages64= java.util.Arrays.asList(typemessages64);
        tempmessages64 = listmessages64.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempmessages64);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">results:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ReportRow[] typeresults66 = remoteReportCall13mtemp.getResults();
        String tempresults66 = null;
        if(typeresults66 != null){
        java.util.List listresults66= java.util.Arrays.asList(typeresults66);
        tempresults66 = listresults66.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempresults66);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">canDrill:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Boolean typecanDrill68 = remoteReportCall13mtemp.getCanDrill();
        String tempResultcanDrill68 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecanDrill68));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultcanDrill68 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">dataOutput:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typedataOutput70 = remoteReportCall13mtemp.getDataOutput();
        String tempResultdataOutput70 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedataOutput70));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultdataOutput70 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">authoringMode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typeauthoringMode72 = remoteReportCall13mtemp.getAuthoringMode();
        String tempResultauthoringMode72 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeauthoringMode72));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultauthoringMode72 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">dashboard:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">owner:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.Integer typeowner76 = tebece0.getOwner();
        String tempResultowner76 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeowner76));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultowner76 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">languageCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typelanguageCode78 = tebece0.getLanguageCode();
        String tempResultlanguageCode78 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelanguageCode78));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultlanguageCode78 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">startDate:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.util.Calendar typestartDate80 = tebece0.getStartDate();
        java.text.DateFormat dateFormatstartDate80 = java.text.DateFormat.getDateInstance();
        java.util.Date datestartDate80 = typestartDate80.getTime();
        String tempResultstartDate80 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatstartDate80.format(datestartDate80));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultstartDate80 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">longDescription:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typelongDescription82 = tebece0.getLongDescription();
        String tempResultlongDescription82 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelongDescription82));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultlongDescription82 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">styleCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typestyleCode84 = tebece0.getStyleCode();
        String tempResultstyleCode84 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestyleCode84));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultstyleCode84 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">audience:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typeaudience86 = tebece0.getAudience();
        String tempResultaudience86 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaudience86));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultaudience86 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">statusCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typestatusCode88 = tebece0.getStatusCode();
        String tempResultstatusCode88 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatusCode88));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultstatusCode88 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">filters:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
com.hof.mi.web.service.DashboardFilterDefinition[] typefilters90 = tebece0.getFilters();
        String tempfilters90 = null;
        if(typefilters90 != null){
        java.util.List listfilters90= java.util.Arrays.asList(typefilters90);
        tempfilters90 = listfilters90.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempfilters90);
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">subCategoryCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typesubCategoryCode92 = tebece0.getSubCategoryCode();
        String tempResultsubCategoryCode92 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesubCategoryCode92));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultsubCategoryCode92 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">categoryCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typecategoryCode94 = tebece0.getCategoryCode();
        String tempResultcategoryCode94 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecategoryCode94));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultcategoryCode94 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">shortDescription:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typeshortDescription96 = tebece0.getShortDescription();
        String tempResultshortDescription96 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeshortDescription96));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultshortDescription96 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">elements:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
com.hof.mi.web.service.DashboardElement[] typeelements98 = tebece0.getElements();
        String tempelements98 = null;
        if(typeelements98 != null){
        java.util.List listelements98= java.util.Arrays.asList(typeelements98);
        tempelements98 = listelements98.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempelements98);
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">parentGroupId:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.Integer typeparentGroupId100 = tebece0.getParentGroupId();
        String tempResultparentGroupId100 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeparentGroupId100));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultparentGroupId100 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">accessCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typeaccessCode102 = tebece0.getAccessCode();
        String tempResultaccessCode102 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaccessCode102));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultaccessCode102 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">fields:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
com.hof.mi.web.service.DashboardFieldDefinition[] typefields104 = tebece0.getFields();
        String tempfields104 = null;
        if(typefields104 != null){
        java.util.List listfields104= java.util.Arrays.asList(typefields104);
        tempfields104 = listfields104.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempfields104);
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">endDate:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.util.Calendar typeendDate106 = tebece0.getEndDate();
        java.text.DateFormat dateFormatendDate106 = java.text.DateFormat.getDateInstance();
        java.util.Date dateendDate106 = typeendDate106.getTime();
        String tempResultendDate106 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatendDate106.format(dateendDate106));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultendDate106 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">ownerTypeCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typeownerTypeCode108 = tebece0.getOwnerTypeCode();
        String tempResultownerTypeCode108 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeownerTypeCode108));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultownerTypeCode108 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">groupTypeCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.String typegroupTypeCode110 = tebece0.getGroupTypeCode();
        String tempResultgroupTypeCode110 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typegroupTypeCode110));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultgroupTypeCode110 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">tabId:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DashboardDefinition tebece0=remoteReportCall13mtemp.getDashboard();
if(tebece0 != null){
java.lang.Integer typetabId112 = tebece0.getTabId();
        String tempResulttabId112 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetabId112));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResulttabId112 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">relatedReports:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">reportId:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.RelatedReports tebece0=remoteReportCall13mtemp.getRelatedReports();
if(tebece0 != null){
java.lang.Integer typereportId116 = tebece0.getReportId();
        String tempResultreportId116 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportId116));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportId116 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">relatedReports:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.RelatedReports tebece0=remoteReportCall13mtemp.getRelatedReports();
if(tebece0 != null){
com.hof.mi.web.service.RelatedReport[] typerelatedReports118 = tebece0.getRelatedReports();
        String temprelatedReports118 = null;
        if(typerelatedReports118 != null){
        java.util.List listrelatedReports118= java.util.Arrays.asList(typerelatedReports118);
        temprelatedReports118 = listrelatedReports118.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(temprelatedReports118);
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">breadcrumbs:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.BreadCrumb[] typebreadcrumbs120 = remoteReportCall13mtemp.getBreadcrumbs();
        String tempbreadcrumbs120 = null;
        if(typebreadcrumbs120 != null){
        java.util.List listbreadcrumbs120= java.util.Arrays.asList(typebreadcrumbs120);
        tempbreadcrumbs120 = listbreadcrumbs120.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempbreadcrumbs120);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">binaryData:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typebinaryData122 = remoteReportCall13mtemp.getBinaryData();
        String tempResultbinaryData122 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebinaryData122));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultbinaryData122 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">schedule:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">advancedTime:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.Integer typeadvancedTime126 = tebece0.getAdvancedTime();
        String tempResultadvancedTime126 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeadvancedTime126));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultadvancedTime126 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">advancedTimezoneCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.String typeadvancedTimezoneCode128 = tebece0.getAdvancedTimezoneCode();
        String tempResultadvancedTimezoneCode128 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeadvancedTimezoneCode128));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultadvancedTimezoneCode128 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">frequencyUnit:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.Integer typefrequencyUnit130 = tebece0.getFrequencyUnit();
        String tempResultfrequencyUnit130 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefrequencyUnit130));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultfrequencyUnit130 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">conditionList:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
com.hof.mi.web.service.Condition[] typeconditionList132 = tebece0.getConditionList();
        String tempconditionList132 = null;
        if(typeconditionList132 != null){
        java.util.List listconditionList132= java.util.Arrays.asList(typeconditionList132);
        tempconditionList132 = listconditionList132.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempconditionList132);
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">frequencyCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.String typefrequencyCode134 = tebece0.getFrequencyCode();
        String tempResultfrequencyCode134 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefrequencyCode134));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultfrequencyCode134 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">recipient:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.Integer typerecipient136 = tebece0.getRecipient();
        String tempResultrecipient136 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typerecipient136));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultrecipient136 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">subject:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.String typesubject138 = tebece0.getSubject();
        String tempResultsubject138 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesubject138));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultsubject138 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">frequencyTypeCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.String typefrequencyTypeCode140 = tebece0.getFrequencyTypeCode();
        String tempResultfrequencyTypeCode140 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefrequencyTypeCode140));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultfrequencyTypeCode140 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">format:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.String typeformat142 = tebece0.getFormat();
        String tempResultformat142 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeformat142));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultformat142 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">bodyText:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.ScheduleRecord tebece0=remoteReportCall13mtemp.getSchedule();
if(tebece0 != null){
java.lang.String typebodyText144 = tebece0.getBodyText();
        String tempResultbodyText144 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebodyText144));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultbodyText144 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportTemplate:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typereportTemplate146 = remoteReportCall13mtemp.getReportTemplate();
        String tempResultreportTemplate146 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportTemplate146));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportTemplate146 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">modifiedReports:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
int[] typemodifiedReports148 = remoteReportCall13mtemp.getModifiedReports();
        String tempmodifiedReports148 = "[";        for(int imodifiedReports148=0;imodifiedReports148< typemodifiedReports148.length;imodifiedReports148++){
            tempmodifiedReports148 = tempmodifiedReports148 + typemodifiedReports148[imodifiedReports148] + ",";
        }
        int lengthmodifiedReports148 = tempmodifiedReports148.length();
        tempmodifiedReports148 = tempmodifiedReports148.substring(0,(lengthmodifiedReports148 - 1)) + "]";
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempmodifiedReports148);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">drillAnywhereCategories:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String[] typedrillAnywhereCategories150 = remoteReportCall13mtemp.getDrillAnywhereCategories();
        String tempdrillAnywhereCategories150 = null;
        if(typedrillAnywhereCategories150 != null){
        java.util.List listdrillAnywhereCategories150= java.util.Arrays.asList(typedrillAnywhereCategories150);
        tempdrillAnywhereCategories150 = listdrillAnywhereCategories150.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempdrillAnywhereCategories150);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">lastModifiedDate:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typelastModifiedDate152 = remoteReportCall13mtemp.getLastModifiedDate();
        String tempResultlastModifiedDate152 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastModifiedDate152));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultlastModifiedDate152 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">sortableColumns:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.SortableTableColumn[] typesortableColumns154 = remoteReportCall13mtemp.getSortableColumns();
        String tempsortableColumns154 = null;
        if(typesortableColumns154 != null){
        java.util.List listsortableColumns154= java.util.Arrays.asList(typesortableColumns154);
        tempsortableColumns154 = listsortableColumns154.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempsortableColumns154);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">lastRunTime:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.math.BigDecimal typelastRunTime156 = remoteReportCall13mtemp.getLastRunTime();
        String tempResultlastRunTime156 = org.eclipse.jst.ws.util.JspUtils.markup(typelastRunTime156.toString());
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultlastRunTime156 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">tags:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typetags158 = remoteReportCall13mtemp.getTags();
        String tempResulttags158 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetags158));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResulttags158 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportType:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typereportType160 = remoteReportCall13mtemp.getReportType();
        String tempResultreportType160 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportType160));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportType160 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">lastRunStatus:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typelastRunStatus162 = remoteReportCall13mtemp.getLastRunStatus();
        String tempResultlastRunStatus162 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastRunStatus162));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultlastRunStatus162 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">displayedReportId:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typedisplayedReportId164 = remoteReportCall13mtemp.getDisplayedReportId();
        String tempResultdisplayedReportId164 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedisplayedReportId164));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultdisplayedReportId164 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">kPI:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">variance:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
vw_pun_atm_dv60.services.ReportService.KPI tebece0=remoteReportCall13mtemp.getKPI();
if(tebece0 != null){
java.lang.String typevariance168 = tebece0.getVariance();
        String tempResultvariance168 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typevariance168));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultvariance168 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">target:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
vw_pun_atm_dv60.services.ReportService.KPI tebece0=remoteReportCall13mtemp.getKPI();
if(tebece0 != null){
java.lang.String typetarget170 = tebece0.getTarget();
        String tempResulttarget170 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetarget170));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResulttarget170 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">actual:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
vw_pun_atm_dv60.services.ReportService.KPI tebece0=remoteReportCall13mtemp.getKPI();
if(tebece0 != null){
java.lang.String typeactual172 = tebece0.getActual();
        String tempResultactual172 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeactual172));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultactual172 );
      out.write("\r\n");
      out.write("        ");

}}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">sessionId:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typesessionId174 = remoteReportCall13mtemp.getSessionId();
        String tempResultsessionId174 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesessionId174));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultsessionId174 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">averageRunTime:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typeaverageRunTime176 = remoteReportCall13mtemp.getAverageRunTime();
        String tempResultaverageRunTime176 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaverageRunTime176));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultaverageRunTime176 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">hitCount:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typehitCount178 = remoteReportCall13mtemp.getHitCount();
        String tempResulthitCount178 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typehitCount178));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResulthitCount178 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">selectedSortOrder:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typeselectedSortOrder180 = remoteReportCall13mtemp.getSelectedSortOrder();
        String tempResultselectedSortOrder180 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeselectedSortOrder180));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultselectedSortOrder180 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">datasource:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typedatasource182 = remoteReportCall13mtemp.getDatasource();
        String tempResultdatasource182 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedatasource182));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultdatasource182 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">lastRunDuration:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.Integer typelastRunDuration184 = remoteReportCall13mtemp.getLastRunDuration();
        String tempResultlastRunDuration184 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastRunDuration184));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultlastRunDuration184 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">gisMap:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.GISMap[] typegisMap186 = remoteReportCall13mtemp.getGisMap();
        String tempgisMap186 = null;
        if(typegisMap186 != null){
        java.util.List listgisMap186= java.util.Arrays.asList(typegisMap186);
        tempgisMap186 = listgisMap186.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempgisMap186);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportStyle:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typereportStyle188 = remoteReportCall13mtemp.getReportStyle();
        String tempResultreportStyle188 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportStyle188));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportStyle188 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">preRunFilterString:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typepreRunFilterString190 = remoteReportCall13mtemp.getPreRunFilterString();
        String tempResultpreRunFilterString190 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepreRunFilterString190));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultpreRunFilterString190 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">drillAnywhereTargets:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
com.hof.mi.web.service.DrillAnywhereTargets[] typedrillAnywhereTargets192 = remoteReportCall13mtemp.getDrillAnywhereTargets();
        String tempdrillAnywhereTargets192 = null;
        if(typedrillAnywhereTargets192 != null){
        java.util.List listdrillAnywhereTargets192= java.util.Arrays.asList(typedrillAnywhereTargets192);
        tempdrillAnywhereTargets192 = listdrillAnywhereTargets192.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempdrillAnywhereTargets192);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">subCategory:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typesubCategory194 = remoteReportCall13mtemp.getSubCategory();
        String tempResultsubCategory194 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesubCategory194));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultsubCategory194 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">drillCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typedrillCode196 = remoteReportCall13mtemp.getDrillCode();
        String tempResultdrillCode196 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedrillCode196));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultdrillCode196 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">formatCode:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typeformatCode198 = remoteReportCall13mtemp.getFormatCode();
        String tempResultformatCode198 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeformatCode198));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultformatCode198 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">storyboardDescriptors:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
vw_pun_atm_dv60.services.ReportService.StoryboardDescriptor[] typestoryboardDescriptors200 = remoteReportCall13mtemp.getStoryboardDescriptors();
        String tempstoryboardDescriptors200 = null;
        if(typestoryboardDescriptors200 != null){
        java.util.List liststoryboardDescriptors200= java.util.Arrays.asList(typestoryboardDescriptors200);
        tempstoryboardDescriptors200 = liststoryboardDescriptors200.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempstoryboardDescriptors200);
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">reportName:</TD>\r\n");
      out.write("<TD>\r\n");

if(remoteReportCall13mtemp != null){
java.lang.String typereportName202 = remoteReportCall13mtemp.getReportName();
        String tempResultreportName202 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typereportName202));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreportName202 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("</TABLE>\r\n");

}
break;
}
} catch (Exception e) { 

      out.write("\r\n");
      out.write("Exception: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) );
      out.write("\r\n");
      out.write("Message: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) );
      out.write('\r');
      out.write('\n');

return;
}
if(!gotMethod){

      out.write("\r\n");
      out.write("result: N/A\r\n");

}

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
