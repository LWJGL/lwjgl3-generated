/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to AL 1.1 functionality. */
public class AL11 {

    /** General tokens. */
    public static final int
        AL_SEC_OFFSET                = 0x1024,
        AL_SAMPLE_OFFSET             = 0x1025,
        AL_BYTE_OFFSET               = 0x1026,
        AL_STATIC                    = 0x1028,
        AL_STREAMING                 = 0x1029,
        AL_UNDETERMINED              = 0x1030,
        AL_ILLEGAL_COMMAND           = 0xA004,
        AL_SPEED_OF_SOUND            = 0xC003,
        AL_LINEAR_DISTANCE           = 0xD003,
        AL_LINEAR_DISTANCE_CLAMPED   = 0xD004,
        AL_EXPONENT_DISTANCE         = 0xD005,
        AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;

    protected AL11() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(ALCapabilities caps) {
        return checkFunctions(
            caps.alListener3i, caps.alGetListeneriv, caps.alSource3i, caps.alListeneriv, caps.alSourceiv, caps.alBufferf, caps.alBuffer3f, caps.alBufferfv, 
            caps.alBufferi, caps.alBuffer3i, caps.alBufferiv, caps.alGetBufferiv, caps.alGetBufferfv, caps.alSpeedOfSound
        );
    }

    // --- [ alListener3i ] ---

    /**
     * Sets the 3 dimensional integer values of a listener parameter.
     *
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    public static void alListener3i(int paramName, float value1, float value2, float value3) {
        long __functionAddress = AL.getICD().alListener3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress, paramName, value1, value2, value3);
    }

    // --- [ alGetListeneriv ] ---

    /** Unsafe version of: {@link #alGetListeneriv GetListeneriv} */
    public static void nalGetListeneriv(int param, long values) {
        long __functionAddress = AL.getICD().alGetListeneriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(__functionAddress, param, values);
    }

    /**
     * Returns the integer values of the specified listener parameter.
     *
     * @param param  the parameter to query
     * @param values the parameter values
     */
    public static void alGetListeneriv(int param, IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetListeneriv(param, memAddress(values));
    }

    // --- [ alSource3i ] ---

    /**
     * Sets the 3 dimensional integer values of a source parameter.
     *
     * @param source    the source to modify
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    public static void alSource3i(int source, int paramName, int value1, int value2, int value3) {
        long __functionAddress = AL.getICD().alSource3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress, source, paramName, value1, value2, value3);
    }

    // --- [ alListeneriv ] ---

    /** Unsafe version of: {@link #alListeneriv Listeneriv} */
    public static void nalListeneriv(int listener, long value) {
        long __functionAddress = AL.getICD().alListeneriv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(__functionAddress, listener, value);
    }

    /**
     * Pointer version.
     *
     * @param listener the parameter to modify
     * @param value    the parameter values
     */
    public static void alListeneriv(int listener, IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalListeneriv(listener, memAddress(value));
    }

    // --- [ alSourceiv ] ---

    /** Unsafe version of: {@link #alSourceiv Sourceiv} */
    public static void nalSourceiv(int source, int paramName, long value) {
        long __functionAddress = AL.getICD().alSourceiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(__functionAddress, source, paramName, value);
    }

    /**
     * Pointer version.
     *
     * @param source    the source to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    public static void alSourceiv(int source, int paramName, IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalSourceiv(source, paramName, memAddress(value));
    }

    // --- [ alBufferf ] ---

    /**
     * Sets the float value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the value
     */
    public static void alBufferf(int buffer, int paramName, float value) {
        long __functionAddress = AL.getICD().alBufferf;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress, buffer, paramName, value);
    }

    // --- [ alBuffer3f ] ---

    /**
     * Sets the dimensional value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    public static void alBuffer3f(int buffer, int paramName, float value1, float value2, float value3) {
        long __functionAddress = AL.getICD().alBuffer3f;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress, buffer, paramName, value1, value2, value3);
    }

    // --- [ alBufferfv ] ---

    /** Unsafe version of: {@link #alBufferfv Bufferfv} */
    public static void nalBufferfv(int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(__functionAddress, buffer, paramName, value);
    }

    /**
     * the pointer version of {@link #alBufferf Bufferf}
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    public static void alBufferfv(int buffer, int paramName, FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalBufferfv(buffer, paramName, memAddress(value));
    }

    // --- [ alBufferi ] ---

    /**
     * Sets the integer value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the value
     */
    public static void alBufferi(int buffer, int paramName, int value) {
        long __functionAddress = AL.getICD().alBufferi;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress, buffer, paramName, value);
    }

    // --- [ alBuffer3i ] ---

    /**
     * Sets the integer 3 dimensional value of a buffer parameter.
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value1    the first value
     * @param value2    the second value
     * @param value3    the third value
     */
    public static void alBuffer3i(int buffer, int paramName, int value1, int value2, int value3) {
        long __functionAddress = AL.getICD().alBuffer3i;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress, buffer, paramName, value1, value2, value3);
    }

    // --- [ alBufferiv ] ---

    /** Unsafe version of: {@link #alBufferiv Bufferiv} */
    public static void nalBufferiv(int buffer, int paramName, long value) {
        long __functionAddress = AL.getICD().alBufferiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(__functionAddress, buffer, paramName, value);
    }

    /**
     * the pointer version of {@link #alBufferi Bufferi}
     *
     * @param buffer    the buffer to modify
     * @param paramName the parameter to modify
     * @param value     the parameter values
     */
    public static void alBufferiv(int buffer, int paramName, IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nalBufferiv(buffer, paramName, memAddress(value));
    }

    // --- [ alGetBufferiv ] ---

    /** Unsafe version of: {@link #alGetBufferiv GetBufferiv} */
    public static void nalGetBufferiv(int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(__functionAddress, buffer, param, values);
    }

    /**
     * Returns the integer values of the specified buffer parameter.
     *
     * @param buffer the buffer to query
     * @param param  the parameter to query
     * @param values the parameter values
     */
    public static void alGetBufferiv(int buffer, int param, IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetBufferiv(buffer, param, memAddress(values));
    }

    // --- [ alGetBufferfv ] ---

    /** Unsafe version of: {@link #alGetBufferfv GetBufferfv} */
    public static void nalGetBufferfv(int buffer, int param, long values) {
        long __functionAddress = AL.getICD().alGetBufferfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePV(__functionAddress, buffer, param, values);
    }

    /**
     * Returns the float values of the specified buffer parameter.
     *
     * @param buffer the buffer to query
     * @param param  the parameter to query
     * @param values the parameter values
     */
    public static void alGetBufferfv(int buffer, int param, FloatBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nalGetBufferfv(buffer, param, memAddress(values));
    }

    // --- [ alSpeedOfSound ] ---

    /**
     * Sets the speed of sound.
     *
     * @param value the speed of sound
     */
    public static void alSpeedOfSound(float value) {
        long __functionAddress = AL.getICD().alSpeedOfSound;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress, value);
    }

    /** Array version of: {@link #alGetListeneriv GetListeneriv} */
    public static void alGetListeneriv(int param, int[] values) {
        long __functionAddress = AL.getICD().alGetListeneriv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(__functionAddress, param, values);
    }

    /** Array version of: {@link #alListeneriv Listeneriv} */
    public static void alListeneriv(int listener, int[] value) {
        long __functionAddress = AL.getICD().alListeneriv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(__functionAddress, listener, value);
    }

    /** Array version of: {@link #alSourceiv Sourceiv} */
    public static void alSourceiv(int source, int paramName, int[] value) {
        long __functionAddress = AL.getICD().alSourceiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(__functionAddress, source, paramName, value);
    }

    /** Array version of: {@link #alBufferfv Bufferfv} */
    public static void alBufferfv(int buffer, int paramName, float[] value) {
        long __functionAddress = AL.getICD().alBufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(__functionAddress, buffer, paramName, value);
    }

    /** Array version of: {@link #alBufferiv Bufferiv} */
    public static void alBufferiv(int buffer, int paramName, int[] value) {
        long __functionAddress = AL.getICD().alBufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        invokePV(__functionAddress, buffer, paramName, value);
    }

    /** Array version of: {@link #alGetBufferiv GetBufferiv} */
    public static void alGetBufferiv(int buffer, int param, int[] values) {
        long __functionAddress = AL.getICD().alGetBufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(__functionAddress, buffer, param, values);
    }

    /** Array version of: {@link #alGetBufferfv GetBufferfv} */
    public static void alGetBufferfv(int buffer, int param, float[] values) {
        long __functionAddress = AL.getICD().alGetBufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        invokePV(__functionAddress, buffer, param, values);
    }

}