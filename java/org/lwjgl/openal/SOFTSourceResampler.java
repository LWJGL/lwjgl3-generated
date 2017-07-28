/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://kcat.strangesoft.net/openal-extensions/AL_SOFT_source_resampler.txt">AL_SOFT_source_resampler</a> extension.
 * 
 * <p>This extension provides a method for applications to use different resamplers for sources. OpenAL automatically resamples when playing a source at a
 * sample rate that don't match the device's sample rate, but the resampling method is left unspecified. One could assume it would use the "best" resample
 * method available, but this gives no clear information about what's used nor any way to choose between quality or performance. Further, some
 * applications may prefer lower quality resamplers for its spectral properties.</p>
 */
public class SOFTSourceResampler {

    /** Accepted as the {@code pname} parameter of {@link AL10#alGetInteger GetInteger} and {@link AL10#alGetIntegerv GetIntegerv}. */
    public static final int
        AL_NUM_RESAMPLERS_SOFT    = 0x1210,
        AL_DEFAULT_RESAMPLER_SOFT = 0x1211;

    /** Accepted as the {@code param} parameter of {@link AL10#alSourcei Sourcei}, {@link AL11#alSourceiv Sourceiv}, {@link AL10#alGetSourcei GetSourcei}, and {@link AL10#alGetSourceiv GetSourceiv}. */
    public static final int AL_SOURCE_RESAMPLER_SOFT = 0x1212;

    /** Accepted as the {@code pname} parameter of {@link #alGetStringiSOFT GetStringiSOFT}. */
    public static final int AL_RESAMPLER_NAME_SOFT = 0x1213;

    protected SOFTSourceResampler() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(ALCapabilities caps) {
        return checkFunctions(
            caps.alGetStringiSOFT
        );
    }

    // --- [ alGetStringiSOFT ] ---

    public static long nalGetStringiSOFT(int pname, int index) {
        long __functionAddress = AL.getICD().alGetStringiSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress, pname, index);
    }

    @NativeType("const ALchar *")
    public static String alGetStringiSOFT(@NativeType("ALenum") int pname, @NativeType("ALsizei") int index) {
        long __result = nalGetStringiSOFT(pname, index);
        return memUTF8(__result);
    }

}