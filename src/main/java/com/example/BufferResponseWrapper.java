package com.example;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

final class BufferResponseWrapper extends HttpServletResponseWrapper
{

    MyServletOutputStream stream = new MyServletOutputStream();

    public BufferResponseWrapper(HttpServletResponse httpServletResponse)
    {
        super(httpServletResponse);
    }

    public ServletOutputStream getOutputStream() throws IOException
    {
        return stream;
    }

    public PrintWriter getWriter() throws IOException
    {
        return new PrintWriter(stream);
    }

    public byte[] getWrapperBytes()
    {
        return stream.getBytes();
    }
}