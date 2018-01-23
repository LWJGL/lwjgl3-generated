/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * HIGH LEVEL TRACKING SPACE ASSUMPTIONS:
 * 
 * <ul>
 * <li>0,0,0 is the preferred standing area center.</li>
 * <li>0Y is the floor height.</li>
 * <li>-Z is the preferred forward facing direction.</li>
 * </ul>
 */
public class VRChaperone {

    protected VRChaperone() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRChaperone_GetCalibrationState ] ---

    /** Get the current state of Chaperone calibration. This state can change at any time during a session due to physical base station changes. */
    @NativeType("ChaperoneCalibrationState")
    public static int VRChaperone_GetCalibrationState() {
        long __functionAddress = OpenVR.VRChaperone.GetCalibrationState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRChaperone_GetPlayAreaSize ] ---

    /** Unsafe version of: {@link #VRChaperone_GetPlayAreaSize GetPlayAreaSize} */
    public static boolean nVRChaperone_GetPlayAreaSize(long pSizeX, long pSizeZ) {
        long __functionAddress = OpenVR.VRChaperone.GetPlayAreaSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(__functionAddress, pSizeX, pSizeZ);
    }

    /**
     * Returns the width and depth of the Play Area (formerly named Soft Bounds) in X and Z. Tracking space center(0, 0, 0) is the center of the Play Area.
     *
     * @param pSizeX 
     * @param pSizeZ 
     */
    @NativeType("bool")
    public static boolean VRChaperone_GetPlayAreaSize(@NativeType("float *") FloatBuffer pSizeX, @NativeType("float *") FloatBuffer pSizeZ) {
        if (CHECKS) {
            check(pSizeX, 1);
            check(pSizeZ, 1);
        }
        return nVRChaperone_GetPlayAreaSize(memAddress(pSizeX), memAddress(pSizeZ));
    }

    // --- [ VRChaperone_GetPlayAreaRect ] ---

    /** Unsafe version of: {@link #VRChaperone_GetPlayAreaRect GetPlayAreaRect} */
    public static boolean nVRChaperone_GetPlayAreaRect(long rect) {
        long __functionAddress = OpenVR.VRChaperone.GetPlayAreaRect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(__functionAddress, rect);
    }

    /**
     * Returns the 4 corner positions of the Play Area (formerly named Soft Bounds).
     * 
     * <p>Corners are in counter-clockwise order. Standing center (0,0,0) is the center of the Play Area. It's a rectangle. 2 sides are parallel to the X axis
     * and 2 sides are parallel to the Z axis. Height of every corner is 0Y (on the floor).</p>
     *
     * @param rect 
     */
    @NativeType("bool")
    public static boolean VRChaperone_GetPlayAreaRect(@NativeType("HmdQuad_t *") HmdQuad rect) {
        return nVRChaperone_GetPlayAreaRect(rect.address());
    }

    // --- [ VRChaperone_ReloadInfo ] ---

    /** Reload Chaperone data from the .vrchap file on disk. */
    public static void VRChaperone_ReloadInfo() {
        long __functionAddress = OpenVR.VRChaperone.ReloadInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRChaperone_SetSceneColor ] ---

    /** Unsafe version of: {@link #VRChaperone_SetSceneColor SetSceneColor} */
    public static void nVRChaperone_SetSceneColor(long color) {
        long __functionAddress = OpenVR.VRChaperone.SetSceneColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, color);
    }

    /**
     * Optionally give the chaperone system a hit about the color and brightness in the scene.
     *
     * @param color 
     */
    public static void VRChaperone_SetSceneColor(@NativeType("HmdColor_t") HmdColor color) {
        nVRChaperone_SetSceneColor(color.address());
    }

    // --- [ VRChaperone_GetBoundsColor ] ---

    /** Unsafe version of: {@link #VRChaperone_GetBoundsColor GetBoundsColor} */
    public static void nVRChaperone_GetBoundsColor(long pOutputColorArray, int nNumOutputColors, float flCollisionBoundsFadeDistance, long pOutputCameraColor) {
        long __functionAddress = OpenVR.VRChaperone.GetBoundsColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(__functionAddress, pOutputColorArray, nNumOutputColors, flCollisionBoundsFadeDistance, pOutputCameraColor);
    }

    /**
     * Get the current chaperone bounds draw color and brightness.
     *
     * @param pOutputColorArray             
     * @param flCollisionBoundsFadeDistance 
     * @param pOutputCameraColor            
     */
    public static void VRChaperone_GetBoundsColor(@NativeType("HmdColor_t *") HmdColor.Buffer pOutputColorArray, @NativeType("float") float flCollisionBoundsFadeDistance, @NativeType("HmdColor_t *") HmdColor pOutputCameraColor) {
        nVRChaperone_GetBoundsColor(pOutputColorArray.address(), pOutputColorArray.remaining(), flCollisionBoundsFadeDistance, pOutputCameraColor.address());
    }

    // --- [ VRChaperone_AreBoundsVisible ] ---

    /** Determine whether the bounds are showing right now. */
    @NativeType("bool")
    public static boolean VRChaperone_AreBoundsVisible() {
        long __functionAddress = OpenVR.VRChaperone.AreBoundsVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRChaperone_ForceBoundsVisible ] ---

    /**
     * Force the bounds to show, mostly for utilities.
     *
     * @param bForce 
     */
    public static void VRChaperone_ForceBoundsVisible(@NativeType("bool") boolean bForce) {
        long __functionAddress = OpenVR.VRChaperone.ForceBoundsVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress, bForce);
    }

}