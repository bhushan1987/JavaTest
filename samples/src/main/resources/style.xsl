<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" >
    <xsl:output method="text" omit-xml-declaration="yes" indent="no"/>
    <xsl:template match="/">
        serialNumber,type,name,host,path,location,severity,confidence,issueBackground,remediationBackground,references,vulnerabilityClassifications
        <xsl:for-each select="//issue">


            <xsl:value-of select="//serialNumber"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//type"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//name"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//host"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//path"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//location"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//severity"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//confidence"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//issueBackground"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//remediationBackground"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//references"/>
            <xsl:text>,</xsl:text>
            <xsl:value-of select="//vulnerabilityClassifications"/>

        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>