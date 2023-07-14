package com.example;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class MyServletOutputStream extends ServletOutputStream
{
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    public void write(int b) throws IOException
    {
        out.write(b);
    }

    public byte[] getBytes()
    {
        return out.toByteArray();
    }

    @Override
    public boolean isReady() {
        return true;
    }

    @Override
    public void setWriteListener(WriteListener writeListener) {

    }
}
