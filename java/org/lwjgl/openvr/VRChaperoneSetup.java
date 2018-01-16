/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Manages the working copy of the chaperone info. By default this will be the same as the live copy. Any changes made with this interface will stay in
 * the working copy until {@link #VRChaperoneSetup_CommitWorkingCopy CommitWorkingCopy} is called, at which point the working copy and the live copy will be the same again.
 */
public class VRChaperoneSetup {

    protected VRChaperoneSetup() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRChaperoneSetup_CommitWorkingCopy ] ---

    /**
     * Saves the current working copy to disk.
     *
     * @param configFile one of:<br><table><tr><td>{@link VR#EChaperoneConfigFile_Live}</td><td>{@link VR#EChaperoneConfigFile_Temp}</td></tr></table>
     */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_CommitWorkingCopy(@NativeType("EChaperoneConfigFile") int configFile) {
        long __functionAddress = OpenVR.VRChaperoneSetup.CommitWorkingCopy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress, configFile);
    }

    // --- [ VRChaperoneSetup_RevertWorkingCopy ] ---

    /**
     * Reverts the working copy to match the live chaperone calibration.
     * 
     * <p>To modify existing data this MUST be do WHILE getting a non-error {@code ChaperoneCalibrationStatus}. Only after this should you do gets and sets on
     * the existing data.</p>
     */
    public static void VRChaperoneSetup_RevertWorkingCopy() {
        long __functionAddress = OpenVR.VRChaperoneSetup.RevertWorkingCopy;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRChaperoneSetup_GetWorkingPlayAreaSize ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_GetWorkingPlayAreaSize GetWorkingPlayAreaSize} */
    public static boolean nVRChaperoneSetup_GetWorkingPlayAreaSize(long pSizeX, long pSizeZ) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingPlayAreaSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(__functionAddress, pSizeX, pSizeZ);
    }

    /**
     * Returns the width and depth of the Play Area (formerly named Soft Bounds) in X and Z from the working copy. Tracking space center (0,0,0) is the center
     * of the Play Area.
     *
     * @param pSizeX 
     * @param pSizeZ 
     */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingPlayAreaSize(@NativeType("float *") FloatBuffer pSizeX, @NativeType("float *") FloatBuffer pSizeZ) {
        if (CHECKS) {
            check(pSizeX, 1);
            check(pSizeZ, 1);
        }
        return nVRChaperoneSetup_GetWorkingPlayAreaSize(memAddress(pSizeX), memAddress(pSizeZ));
    }

    // --- [ VRChaperoneSetup_GetWorkingPlayAreaRect ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_GetWorkingPlayAreaRect GetWorkingPlayAreaRect} */
    public static boolean nVRChaperoneSetup_GetWorkingPlayAreaRect(long rect) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingPlayAreaRect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(__functionAddress, rect);
    }

    /**
     * Returns the 4 corner positions of the Play Area (formerly named Soft Bounds) from the working copy.
     * 
     * <p>Corners are in clockwise order. Tracking space center (0,0,0) is the center of the Play Area. It's a rectangle. 2 sides are parallel to the X axis and
     * 2 sides are parallel to the Z axis. Height of every corner is 0Y (on the floor).</p>
     *
     * @param rect 
     */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingPlayAreaRect(@NativeType("HmdQuad_t *") HmdQuad rect) {
        return nVRChaperoneSetup_GetWorkingPlayAreaRect(rect.address());
    }

    // --- [ VRChaperoneSetup_GetWorkingCollisionBoundsInfo ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_GetWorkingCollisionBoundsInfo GetWorkingCollisionBoundsInfo} */
    public static boolean nVRChaperoneSetup_GetWorkingCollisionBoundsInfo(long pQuadsBuffer, long punQuadsCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingCollisionBoundsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(__functionAddress, pQuadsBuffer, punQuadsCount);
    }

    /**
     * Returns the number of Quads if the buffer points to null. Otherwise it returns Quads into the buffer up to the max specified from the working copy.
     *
     * @param pQuadsBuffer  
     * @param punQuadsCount 
     */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingCollisionBoundsInfo(@Nullable @NativeType("HmdQuad_t *") HmdQuad.Buffer pQuadsBuffer, @NativeType("uint32_t *") IntBuffer punQuadsCount) {
        if (CHECKS) {
            check(punQuadsCount, 1);
            checkSafe(pQuadsBuffer, punQuadsCount.get(punQuadsCount.position()));
        }
        return nVRChaperoneSetup_GetWorkingCollisionBoundsInfo(memAddressSafe(pQuadsBuffer), memAddress(punQuadsCount));
    }

    // --- [ VRChaperoneSetup_GetLiveCollisionBoundsInfo ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_GetLiveCollisionBoundsInfo GetLiveCollisionBoundsInfo} */
    public static boolean nVRChaperoneSetup_GetLiveCollisionBoundsInfo(long pQuadsBuffer, long punQuadsCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetLiveCollisionBoundsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(__functionAddress, pQuadsBuffer, punQuadsCount);
    }

    /**
     * Returns the number of Quads if the buffer points to null. Otherwise it returns Quads into the buffer up to the max specified.
     *
     * @param pQuadsBuffer  
     * @param punQuadsCount 
     */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetLiveCollisionBoundsInfo(@Nullable @NativeType("HmdQuad_t *") HmdQuad.Buffer pQuadsBuffer, @NativeType("uint32_t *") IntBuffer punQuadsCount) {
        if (CHECKS) {
            check(punQuadsCount, 1);
            checkSafe(pQuadsBuffer, punQuadsCount.get(punQuadsCount.position()));
        }
        return nVRChaperoneSetup_GetLiveCollisionBoundsInfo(memAddressSafe(pQuadsBuffer), memAddress(punQuadsCount));
    }

    // --- [ VRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose GetWorkingSeatedZeroPoseToRawTrackingPose} */
    public static boolean nVRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose(long pmatSeatedZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingSeatedZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(__functionAddress, pmatSeatedZeroPoseToRawTrackingPose);
    }

    /**
     * Returns the preferred seated position from the working copy.
     *
     * @param pmatSeatedZeroPoseToRawTrackingPose 
     */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose(@NativeType("HmdMatrix34_t *") HmdMatrix34 pmatSeatedZeroPoseToRawTrackingPose) {
        return nVRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose(pmatSeatedZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose GetWorkingStandingZeroPoseToRawTrackingPose} */
    public static boolean nVRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose(long pmatStandingZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingStandingZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(__functionAddress, pmatStandingZeroPoseToRawTrackingPose);
    }

    /**
     * Returns the standing origin from the working copy.
     *
     * @param pmatStandingZeroPoseToRawTrackingPose 
     */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose(@NativeType("HmdMatrix34_t *") HmdMatrix34 pmatStandingZeroPoseToRawTrackingPose) {
        return nVRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose(pmatStandingZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_SetWorkingPlayAreaSize ] ---

    /**
     * Sets the Play Area in the working copy.
     *
     * @param sizeX 
     * @param sizeZ 
     */
    public static void VRChaperoneSetup_SetWorkingPlayAreaSize(float sizeX, float sizeZ) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingPlayAreaSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress, sizeX, sizeZ);
    }

    // --- [ VRChaperoneSetup_SetWorkingCollisionBoundsInfo ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_SetWorkingCollisionBoundsInfo SetWorkingCollisionBoundsInfo} */
    public static void nVRChaperoneSetup_SetWorkingCollisionBoundsInfo(long pQuadsBuffer, int unQuadsCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingCollisionBoundsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, pQuadsBuffer, unQuadsCount);
    }

    /**
     * Sets the Collision Bounds in the working copy.
     *
     * @param pQuadsBuffer 
     */
    public static void VRChaperoneSetup_SetWorkingCollisionBoundsInfo(@NativeType("HmdQuad_t *") HmdQuad.Buffer pQuadsBuffer) {
        nVRChaperoneSetup_SetWorkingCollisionBoundsInfo(pQuadsBuffer.address(), pQuadsBuffer.remaining());
    }

    // --- [ VRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose SetWorkingSeatedZeroPoseToRawTrackingPose} */
    public static void nVRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose(long pMatSeatedZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingSeatedZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, pMatSeatedZeroPoseToRawTrackingPose);
    }

    /**
     * Sets the preferred seated position in the working copy.
     *
     * @param pMatSeatedZeroPoseToRawTrackingPose 
     */
    public static void VRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose(@NativeType("const HmdMatrix34_t *") HmdMatrix34 pMatSeatedZeroPoseToRawTrackingPose) {
        nVRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose(pMatSeatedZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose SetWorkingStandingZeroPoseToRawTrackingPose} */
    public static void nVRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose(long pMatStandingZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingStandingZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, pMatStandingZeroPoseToRawTrackingPose);
    }

    /**
     * Sets the preferred standing position in the working copy.
     *
     * @param pMatStandingZeroPoseToRawTrackingPose 
     */
    public static void VRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose(@NativeType("const HmdMatrix34_t *") HmdMatrix34 pMatStandingZeroPoseToRawTrackingPose) {
        nVRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose(pMatStandingZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_ReloadFromDisk ] ---

    /**
     * Tear everything down and reload it from the file on disk.
     *
     * @param configFile one of:<br><table><tr><td>{@link VR#EChaperoneConfigFile_Live}</td><td>{@link VR#EChaperoneConfigFile_Temp}</td></tr></table>
     */
    public static void VRChaperoneSetup_ReloadFromDisk(@NativeType("EChaperoneConfigFile") int configFile) {
        long __functionAddress = OpenVR.VRChaperoneSetup.ReloadFromDisk;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress, configFile);
    }

    // --- [ VRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose ] ---

    /** Unsafe version of: {@link #VRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose GetLiveSeatedZeroPoseToRawTrackingPose} */
    public static boolean nVRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose(long pmatSeatedZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetLiveSeatedZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(__functionAddress, pmatSeatedZeroPoseToRawTrackingPose);
    }

    /**
     * Returns the preferred seated position.
     *
     * @param pmatSeatedZeroPoseToRawTrackingPose 
     */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose(@NativeType("HmdMatrix34_t *") HmdMatrix34 pmatSeatedZeroPoseToRawTrackingPose) {
        return nVRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose(pmatSeatedZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_SetWorkingCollisionBoundsTagsInfo ] ---

    public static void nVRChaperoneSetup_SetWorkingCollisionBoundsTagsInfo(long pTagsBuffer, int unTagCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingCollisionBoundsTagsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, pTagsBuffer, unTagCount);
    }

    public static void VRChaperoneSetup_SetWorkingCollisionBoundsTagsInfo(@NativeType("uint8_t *") ByteBuffer pTagsBuffer) {
        nVRChaperoneSetup_SetWorkingCollisionBoundsTagsInfo(memAddress(pTagsBuffer), pTagsBuffer.remaining());
    }

    // --- [ VRChaperoneSetup_GetLiveCollisionBoundsTagsInfo ] ---

    public static boolean nVRChaperoneSetup_GetLiveCollisionBoundsTagsInfo(long pTagsBuffer, long punTagCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetLiveCollisionBoundsTagsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(__functionAddress, pTagsBuffer, punTagCount);
    }

    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetLiveCollisionBoundsTagsInfo(@Nullable @NativeType("uint8_t *") ByteBuffer pTagsBuffer, @NativeType("uint32_t *") IntBuffer punTagCount) {
        if (CHECKS) {
            check(punTagCount, 1);
            checkSafe(pTagsBuffer, punTagCount.get(punTagCount.position()));
        }
        return nVRChaperoneSetup_GetLiveCollisionBoundsTagsInfo(memAddressSafe(pTagsBuffer), memAddress(punTagCount));
    }

    // --- [ VRChaperoneSetup_SetWorkingPhysicalBoundsInfo ] ---

    public static boolean nVRChaperoneSetup_SetWorkingPhysicalBoundsInfo(long pQuadsBuffer, int unQuadsCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingPhysicalBoundsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(__functionAddress, pQuadsBuffer, unQuadsCount);
    }

    @NativeType("bool")
    public static boolean VRChaperoneSetup_SetWorkingPhysicalBoundsInfo(@NativeType("HmdQuad_t *") HmdQuad.Buffer pQuadsBuffer) {
        return nVRChaperoneSetup_SetWorkingPhysicalBoundsInfo(pQuadsBuffer.address(), pQuadsBuffer.remaining());
    }

    // --- [ VRChaperoneSetup_GetLivePhysicalBoundsInfo ] ---

    public static boolean nVRChaperoneSetup_GetLivePhysicalBoundsInfo(long pQuadsBuffer, long punQuadsCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetLivePhysicalBoundsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(__functionAddress, pQuadsBuffer, punQuadsCount);
    }

    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetLivePhysicalBoundsInfo(@Nullable @NativeType("HmdQuad_t *") HmdQuad.Buffer pQuadsBuffer, @NativeType("uint32_t *") IntBuffer punQuadsCount) {
        if (CHECKS) {
            check(punQuadsCount, 1);
            checkSafe(pQuadsBuffer, punQuadsCount.get(punQuadsCount.position()));
        }
        return nVRChaperoneSetup_GetLivePhysicalBoundsInfo(memAddressSafe(pQuadsBuffer), memAddress(punQuadsCount));
    }

    // --- [ VRChaperoneSetup_ExportLiveToBuffer ] ---

    public static boolean nVRChaperoneSetup_ExportLiveToBuffer(long pBuffer, long pnBufferLength) {
        long __functionAddress = OpenVR.VRChaperoneSetup.ExportLiveToBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(__functionAddress, pBuffer, pnBufferLength);
    }

    @NativeType("bool")
    public static boolean VRChaperoneSetup_ExportLiveToBuffer(@Nullable @NativeType("char *") ByteBuffer pBuffer, @NativeType("uint32_t *") IntBuffer pnBufferLength) {
        if (CHECKS) {
            check(pnBufferLength, 1);
            checkSafe(pBuffer, pnBufferLength.get(pnBufferLength.position()));
        }
        return nVRChaperoneSetup_ExportLiveToBuffer(memAddressSafe(pBuffer), memAddress(pnBufferLength));
    }

    // --- [ VRChaperoneSetup_ImportFromBufferToWorking ] ---

    public static boolean nVRChaperoneSetup_ImportFromBufferToWorking(long pBuffer, int nImportFlags) {
        long __functionAddress = OpenVR.VRChaperoneSetup.ImportFromBufferToWorking;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(__functionAddress, pBuffer, nImportFlags);
    }

    @NativeType("bool")
    public static boolean VRChaperoneSetup_ImportFromBufferToWorking(@NativeType("const char *") ByteBuffer pBuffer, @NativeType("uint32_t") int nImportFlags) {
        return nVRChaperoneSetup_ImportFromBufferToWorking(memAddress(pBuffer), nImportFlags);
    }

}