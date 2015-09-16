<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
<HEAD>
<TITLE>Inputs</TITLE>
</HEAD>
<BODY>
<H1>Inputs</H1>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 5:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">endpoint:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="endpoint8" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 10:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 13:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">in0:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showTabs:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showTabs206" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dashboardTabId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="dashboardTabId208" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">multiChartEnabled:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="multiChartEnabled210" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reportUserId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reportUserId212" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reportId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reportId214" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">absoluteTableWidth:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="absoluteTableWidth216" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">languageCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="languageCode218" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showTimeSlider:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showTimeSlider220" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reportUserPassword:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reportUserPassword222" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showTitle:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showTitle224" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showPageSelection:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showPageSelection226" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showLinks:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showLinks228" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">drillAnywhereUniqueValueName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="drillAnywhereUniqueValueName230" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showSeriesSelection:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showSeriesSelection232" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fitTableWidth:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="fitTableWidth234" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showAlerts:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showAlerts236" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">chartWidth:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="chartWidth238" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">binaryURL:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="binaryURL240" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">imageURL:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="imageURL242" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showDrillDownStack:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showDrillDownStack244" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reportBroadcastSubject:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reportBroadcastSubject246" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">schedule:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">advancedTime:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="advancedTime250" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">advancedTimezoneCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="advancedTimezoneCode252" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">frequencyUnit:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="frequencyUnit254" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">frequencyCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="frequencyCode256" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">recipient:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="recipient258" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">subject:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="subject260" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">frequencyTypeCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="frequencyTypeCode262" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">format:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="format264" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">bodyText:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="bodyText266" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">activeCharts:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="activeCharts268" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showCoDisplay:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showCoDisplay270" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reportComment:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">parentCommentId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="parentCommentId274" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">commentDate:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="commentDate276" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">author:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="author278" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">statusCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="statusCode280" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">comment:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="comment282" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">lastActivityDate:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="lastActivityDate284" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">commentId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="commentId286" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">authorId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="authorId288" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">reportId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reportId290" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">title:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="title292" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">singlePage:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="singlePage294" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">multiReportTag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="multiReportTag296" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reportBroadcastContent:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reportBroadcastContent298" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">alterationCommand:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="alterationCommand300" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">orgId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="orgId302" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="password304" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sortColumn:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="sortColumn306" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dataFormattingOptionsType:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="dataFormattingOptionsType308" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">gisNavigation:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="gisNavigation310" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showDrillThroughStack:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showDrillThroughStack312" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showAlertImages:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showAlertImages314" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showSort:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showSort316" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sessionId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="sessionId318" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">orgRef:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="orgRef320" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">showCharts:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="showCharts322" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">linkFormatterClass:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="linkFormatterClass324" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">objectName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="objectName326" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">loginId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="loginId328" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">chartPlacementCode:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="chartPlacementCode330" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">imageType:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="imageType332" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">linkURL:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="linkURL334" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">distributionText:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="distributionText336" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">chartHeight:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="chartHeight338" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reportClientReferenceId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reportClientReferenceId340" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">reportRequest:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="reportRequest342" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">drillAnywhereFieldId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="drillAnywhereFieldId344" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">drillAnywhereCellValue:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="drillAnywhereCellValue346" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">chartScale:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="chartScale348" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 1111111111:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">URLString:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="url1111111111" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 1111111112:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
}
if (valid) {
%>
Select a method to test.
<%
}
%>

</BODY>
</HTML>
