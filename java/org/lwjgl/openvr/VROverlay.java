/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Overlay management methods. */
public class VROverlay {

    protected VROverlay() {
        throw new UnsupportedOperationException();
    }

    // --- [ VROverlay_FindOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_FindOverlay FindOverlay} */
    public static int nVROverlay_FindOverlay(long pchOverlayKey, long pOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.FindOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, pchOverlayKey, pOverlayHandle);
    }

    /**
     * Finds an existing overlay with the specified key.
     *
     * @param pchOverlayKey  
     * @param pOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_FindOverlay(@NativeType("const char *") ByteBuffer pchOverlayKey, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            checkNT1(pchOverlayKey);
            check(pOverlayHandle, 1);
        }
        return nVROverlay_FindOverlay(memAddress(pchOverlayKey), memAddress(pOverlayHandle));
    }

    /**
     * Finds an existing overlay with the specified key.
     *
     * @param pchOverlayKey  
     * @param pOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_FindOverlay(@NativeType("const char *") CharSequence pchOverlayKey, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            check(pOverlayHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchOverlayKeyEncoded = stack.ASCII(pchOverlayKey);
            return nVROverlay_FindOverlay(memAddress(pchOverlayKeyEncoded), memAddress(pOverlayHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_CreateOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_CreateOverlay CreateOverlay} */
    public static int nVROverlay_CreateOverlay(long pchOverlayKey, long pchOverlayName, long pOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.CreateOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, pchOverlayKey, pchOverlayName, pOverlayHandle);
    }

    /**
     * Creates a new named overlay. All overlays start hidden and with default settings.
     *
     * @param pchOverlayKey  
     * @param pchOverlayName 
     * @param pOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateOverlay(@NativeType("const char *") ByteBuffer pchOverlayKey, @NativeType("const char *") ByteBuffer pchOverlayName, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            checkNT1(pchOverlayKey);
            checkNT1(pchOverlayName);
            check(pOverlayHandle, 1);
        }
        return nVROverlay_CreateOverlay(memAddress(pchOverlayKey), memAddress(pchOverlayName), memAddress(pOverlayHandle));
    }

    /**
     * Creates a new named overlay. All overlays start hidden and with default settings.
     *
     * @param pchOverlayKey  
     * @param pchOverlayName 
     * @param pOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateOverlay(@NativeType("const char *") CharSequence pchOverlayKey, @NativeType("const char *") CharSequence pchOverlayName, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            check(pOverlayHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchOverlayKeyEncoded = stack.ASCII(pchOverlayKey);
            ByteBuffer pchOverlayNameEncoded = stack.ASCII(pchOverlayName);
            return nVROverlay_CreateOverlay(memAddress(pchOverlayKeyEncoded), memAddress(pchOverlayNameEncoded), memAddress(pOverlayHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_DestroyOverlay ] ---

    /**
     * Destroys the specified overlay. When an application calls {@link VR#VR_ShutdownInternal ShutdownInternal} all overlays created by that app are automatically destroyed.
     *
     * @param ulOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_DestroyOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.DestroyOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_SetHighQualityOverlay ] ---

    /**
     * Specify which overlay to use the high quality render path.
     * 
     * <p>This overlay will be composited in during the distortion pass which results in it drawing on top of everything else, but also at a higher quality as it
     * samples the source texture directly rather than rasterizing into each eye's render texture first. Because if this, only one of these is supported at
     * any given time. It is most useful for overlays that are expected to take up most of the user's view (e.g. streaming video). This mode does not support
     * mouse input to your overlay.</p>
     *
     * @param ulOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetHighQualityOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.SetHighQualityOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_GetHighQualityOverlay ] ---

    /**
     * Returns the overlay handle of the current overlay being rendered using the single high quality overlay render path. Otherwise it will return
     * {@link VR#k_ulOverlayHandleInvalid}.
     */
    @NativeType("VROverlayHandle_t")
    public static long VROverlay_GetHighQualityOverlay() {
        long __functionAddress = OpenVR.VROverlay.GetHighQualityOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(__functionAddress);
    }

    // --- [ VROverlay_GetOverlayKey ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayKey GetOverlayKey} */
    public static int nVROverlay_GetOverlayKey(long ulOverlayHandle, long pchValue, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayKey;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, pchValue, unBufferSize, pError);
    }

    /**
     * Fills the provided buffer with the string key of the overlay. Returns the size of buffer required to store the key, including the terminating null
     * character. {@link VR#k_unVROverlayMaxKeyLength} will be enough bytes to fit the string.
     *
     * @param ulOverlayHandle 
     * @param pchValue        
     * @param pError          
     */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayKey(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") ByteBuffer pchValue, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVROverlay_GetOverlayKey(ulOverlayHandle, memAddressSafe(pchValue), remainingSafe(pchValue), memAddress(pError));
    }

    /**
     * Fills the provided buffer with the string key of the overlay. Returns the size of buffer required to store the key, including the terminating null
     * character. {@link VR#k_unVROverlayMaxKeyLength} will be enough bytes to fit the string.
     *
     * @param ulOverlayHandle 
     * @param unBufferSize    
     * @param pError          
     */
    @NativeType("uint32_t")
    public static String VROverlay_GetOverlayKey(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unBufferSize, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVROverlay_GetOverlayKey(ulOverlayHandle, memAddress(pchValue), unBufferSize, memAddress(pError));
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayName ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayName GetOverlayName} */
    public static int nVROverlay_GetOverlayName(long ulOverlayHandle, long pchValue, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, pchValue, unBufferSize, pError);
    }

    /**
     * Fills the provided buffer with the friendly name of the overlay. Returns the size of buffer required to store the key, including the terminating null
     * character. {@link VR#k_unVROverlayMaxNameLength} will be enough bytes to fit the string.
     *
     * @param ulOverlayHandle 
     * @param pchValue        
     * @param pError          
     */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") ByteBuffer pchValue, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVROverlay_GetOverlayName(ulOverlayHandle, memAddressSafe(pchValue), remainingSafe(pchValue), memAddress(pError));
    }

    /**
     * Fills the provided buffer with the friendly name of the overlay. Returns the size of buffer required to store the key, including the terminating null
     * character. {@link VR#k_unVROverlayMaxNameLength} will be enough bytes to fit the string.
     *
     * @param ulOverlayHandle 
     * @param unBufferSize    
     * @param pError          
     */
    @NativeType("uint32_t")
    public static String VROverlay_GetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unBufferSize, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVROverlay_GetOverlayName(ulOverlayHandle, memAddress(pchValue), unBufferSize, memAddress(pError));
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_SetOverlayName ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayName SetOverlayName} */
    public static int nVROverlay_SetOverlayName(long ulOverlayHandle, long pchName) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pchName);
    }

    /**
     * Sets the name to use for this overlay.
     *
     * @param ulOverlayHandle 
     * @param pchName         
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") ByteBuffer pchName) {
        if (CHECKS) {
            checkNT1(pchName);
        }
        return nVROverlay_SetOverlayName(ulOverlayHandle, memAddress(pchName));
    }

    /**
     * Sets the name to use for this overlay.
     *
     * @param ulOverlayHandle 
     * @param pchName         
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") CharSequence pchName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchNameEncoded = stack.ASCII(pchName);
            return nVROverlay_SetOverlayName(ulOverlayHandle, memAddress(pchNameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayImageData ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayImageData GetOverlayImageData} */
    public static int nVROverlay_GetOverlayImageData(long ulOverlayHandle, long pvBuffer, int unBufferSize, long punWidth, long punHeight) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayImageData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPPI(__functionAddress, ulOverlayHandle, pvBuffer, unBufferSize, punWidth, punHeight);
    }

    /**
     * Gets the raw image data from an overlay. Overlay image data is always returned as RGBA data, 4 bytes per pixel. If the buffer is not large enough,
     * width and height will be set and {@link VR#EVROverlayError_VROverlayError_ArrayTooSmall} is returned.
     *
     * @param ulOverlayHandle 
     * @param pvBuffer        
     * @param punWidth        
     * @param punHeight       
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayImageData(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void *") ByteBuffer pvBuffer, @NativeType("uint32_t *") IntBuffer punWidth, @NativeType("uint32_t *") IntBuffer punHeight) {
        if (CHECKS) {
            check(punWidth, 1);
            check(punHeight, 1);
        }
        return nVROverlay_GetOverlayImageData(ulOverlayHandle, memAddress(pvBuffer), pvBuffer.remaining(), memAddress(punWidth), memAddress(punHeight));
    }

    // --- [ VROverlay_GetOverlayErrorNameFromEnum ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayErrorNameFromEnum GetOverlayErrorNameFromEnum} */
    public static long nVROverlay_GetOverlayErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress, error);
    }

    /**
     * Returns a string that corresponds with the specified overlay error. The string will be the name of the error enum value for all valid error codes.
     *
     * @param error one of:<br><table><tr><td>{@link VR#EVROverlayError_VROverlayError_None}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_UnknownOverlay}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_InvalidHandle}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_PermissionDenied}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_OverlayLimitExceeded}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_WrongVisibilityType}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_KeyTooLong}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_NameTooLong}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_KeyInUse}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_WrongTransformType}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_InvalidTrackedDevice}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_InvalidParameter}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_ThumbnailCantBeDestroyed}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_ArrayTooSmall}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_RequestFailed}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_InvalidTexture}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_UnableToLoadFile}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_KeyboardAlreadyInUse}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_NoNeighbor}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TooManyMaskPrimitives}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_BadMaskPrimitive}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TextureAlreadyLocked}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TextureLockCapacityReached}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TextureNotLocked}</td></tr></table>
     */
    @NativeType("const char *")
    public static String VROverlay_GetOverlayErrorNameFromEnum(@NativeType("EVROverlayError") int error) {
        long __result = nVROverlay_GetOverlayErrorNameFromEnum(error);
        return memASCII(__result);
    }

    // --- [ VROverlay_SetOverlayRenderingPid ] ---

    /**
     * Sets the pid that is allowed to render to this overlay (the creator pid is always allow to render), by default this is the pid of the process that made
     * the overlay.
     *
     * @param ulOverlayHandle 
     * @param unPID           
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayRenderingPid(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unPID) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayRenderingPid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, unPID);
    }

    // --- [ VROverlay_GetOverlayRenderingPid ] ---

    /**
     * Gets the pid that is allowed to render to this overlay.
     *
     * @param ulOverlayHandle 
     */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayRenderingPid(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayRenderingPid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_SetOverlayFlag ] ---

    /**
     * Specify flag setting for a given overlay.
     *
     * @param ulOverlayHandle 
     * @param eOverlayFlag    one of:<br><table><tr><td>{@link VR#VROverlayFlags_None}</td><td>{@link VR#VROverlayFlags_Curved}</td></tr><tr><td>{@link VR#VROverlayFlags_RGSS4X}</td><td>{@link VR#VROverlayFlags_NoDashboardTab}</td></tr><tr><td>{@link VR#VROverlayFlags_AcceptsGamepadEvents}</td><td>{@link VR#VROverlayFlags_ShowGamepadFocus}</td></tr><tr><td>{@link VR#VROverlayFlags_SendVRScrollEvents}</td><td>{@link VR#VROverlayFlags_SendVRTouchpadEvents}</td></tr><tr><td>{@link VR#VROverlayFlags_ShowTouchPadScrollWheel}</td><td>{@link VR#VROverlayFlags_TransferOwnershipToInternalProcess}</td></tr><tr><td>{@link VR#VROverlayFlags_SideBySide_Parallel}</td><td>{@link VR#VROverlayFlags_SideBySide_Crossed}</td></tr><tr><td>{@link VR#VROverlayFlags_Panorama}</td><td>{@link VR#VROverlayFlags_StereoPanorama}</td></tr><tr><td>{@link VR#VROverlayFlags_SortWithNonSceneOverlays}</td><td>{@link VR#VROverlayFlags_VisibleInDashboard}</td></tr></table>
     * @param bEnabled        
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayFlag(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayFlags") int eOverlayFlag, @NativeType("bool") boolean bEnabled) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayFlag;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, eOverlayFlag, bEnabled);
    }

    // --- [ VROverlay_GetOverlayFlag ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayFlag GetOverlayFlag} */
    public static int nVROverlay_GetOverlayFlag(long ulOverlayHandle, int eOverlayFlag, long pbEnabled) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayFlag;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, eOverlayFlag, pbEnabled);
    }

    /**
     * Sets flag setting for a given overlay.
     *
     * @param ulOverlayHandle 
     * @param eOverlayFlag    one of:<br><table><tr><td>{@link VR#VROverlayFlags_None}</td><td>{@link VR#VROverlayFlags_Curved}</td></tr><tr><td>{@link VR#VROverlayFlags_RGSS4X}</td><td>{@link VR#VROverlayFlags_NoDashboardTab}</td></tr><tr><td>{@link VR#VROverlayFlags_AcceptsGamepadEvents}</td><td>{@link VR#VROverlayFlags_ShowGamepadFocus}</td></tr><tr><td>{@link VR#VROverlayFlags_SendVRScrollEvents}</td><td>{@link VR#VROverlayFlags_SendVRTouchpadEvents}</td></tr><tr><td>{@link VR#VROverlayFlags_ShowTouchPadScrollWheel}</td><td>{@link VR#VROverlayFlags_TransferOwnershipToInternalProcess}</td></tr><tr><td>{@link VR#VROverlayFlags_SideBySide_Parallel}</td><td>{@link VR#VROverlayFlags_SideBySide_Crossed}</td></tr><tr><td>{@link VR#VROverlayFlags_Panorama}</td><td>{@link VR#VROverlayFlags_StereoPanorama}</td></tr><tr><td>{@link VR#VROverlayFlags_SortWithNonSceneOverlays}</td><td>{@link VR#VROverlayFlags_VisibleInDashboard}</td></tr></table>
     * @param pbEnabled       
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayFlag(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayFlags") int eOverlayFlag, @NativeType("bool *") ByteBuffer pbEnabled) {
        if (CHECKS) {
            check(pbEnabled, 1);
        }
        return nVROverlay_GetOverlayFlag(ulOverlayHandle, eOverlayFlag, memAddress(pbEnabled));
    }

    // --- [ VROverlay_SetOverlayColor ] ---

    /**
     * Sets the color tint of the overlay quad. Use 0.0 to 1.0 per channel.
     *
     * @param ulOverlayHandle 
     * @param fRed            
     * @param fGreen          
     * @param fBlue           
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayColor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fRed, float fGreen, float fBlue) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, fRed, fGreen, fBlue);
    }

    // --- [ VROverlay_GetOverlayColor ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayColor GetOverlayColor} */
    public static int nVROverlay_GetOverlayColor(long ulOverlayHandle, long pfRed, long pfGreen, long pfBlue) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPPI(__functionAddress, ulOverlayHandle, pfRed, pfGreen, pfBlue);
    }

    /**
     * Gets the color tint of the overlay quad.
     *
     * @param ulOverlayHandle 
     * @param pfRed           
     * @param pfGreen         
     * @param pfBlue          
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayColor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfRed, @NativeType("float *") FloatBuffer pfGreen, @NativeType("float *") FloatBuffer pfBlue) {
        if (CHECKS) {
            check(pfRed, 1);
            check(pfGreen, 1);
            check(pfBlue, 1);
        }
        return nVROverlay_GetOverlayColor(ulOverlayHandle, memAddress(pfRed), memAddress(pfGreen), memAddress(pfBlue));
    }

    // --- [ VROverlay_SetOverlayAlpha ] ---

    /**
     * Sets the alpha of the overlay quad. Use 1.0 for 100 percent opacity to 0.0 for 0 percent opacity.
     *
     * @param ulOverlayHandle 
     * @param fAlpha          
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayAlpha(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fAlpha) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayAlpha;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, fAlpha);
    }

    // --- [ VROverlay_GetOverlayAlpha ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayAlpha GetOverlayAlpha} */
    public static int nVROverlay_GetOverlayAlpha(long ulOverlayHandle, long pfAlpha) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayAlpha;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pfAlpha);
    }

    /**
     * Gets the alpha of the overlay quad. By default overlays are rendering at 100 percent alpha (1.0).
     *
     * @param ulOverlayHandle 
     * @param pfAlpha         
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayAlpha(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfAlpha) {
        if (CHECKS) {
            check(pfAlpha, 1);
        }
        return nVROverlay_GetOverlayAlpha(ulOverlayHandle, memAddress(pfAlpha));
    }

    // --- [ VROverlay_SetOverlayTexelAspect ] ---

    /**
     * Sets the aspect ratio of the texels in the overlay. 1.0 means the texels are square. 2.0 means the texels are twice as wide as they are tall.
     * 
     * <p>Defaults to 1.0.</p>
     *
     * @param ulOverlayHandle 
     * @param fTexelAspect    
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTexelAspect(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fTexelAspect) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTexelAspect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, fTexelAspect);
    }

    // --- [ VROverlay_GetOverlayTexelAspect ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTexelAspect GetOverlayTexelAspect} */
    public static int nVROverlay_GetOverlayTexelAspect(long ulOverlayHandle, long pfTexelAspect) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTexelAspect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pfTexelAspect);
    }

    /**
     * Gets the aspect ratio of the texels in the overlay. Defaults to 1.0.
     *
     * @param ulOverlayHandle 
     * @param pfTexelAspect   
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTexelAspect(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfTexelAspect) {
        if (CHECKS) {
            check(pfTexelAspect, 1);
        }
        return nVROverlay_GetOverlayTexelAspect(ulOverlayHandle, memAddress(pfTexelAspect));
    }

    // --- [ VROverlay_SetOverlaySortOrder ] ---

    /**
     * Sets the rendering sort order for the overlay. Overlays are rendered this order:
     * 
     * <ul>
     * <li>Overlays owned by the scene application</li>
     * <li>Overlays owned by some other application</li>
     * </ul>
     * 
     * <p>Within a category overlays are rendered lowest sort order to highest sort order. Overlays with the same sort order are rendered back to front base on
     * distance from the HMD.</p>
     * 
     * <p>Sort order defaults to 0.</p>
     *
     * @param ulOverlayHandle 
     * @param unSortOrder     
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlaySortOrder(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unSortOrder) {
        long __functionAddress = OpenVR.VROverlay.SetOverlaySortOrder;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, unSortOrder);
    }

    // --- [ VROverlay_GetOverlaySortOrder ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlaySortOrder GetOverlaySortOrder} */
    public static int nVROverlay_GetOverlaySortOrder(long ulOverlayHandle, long punSortOrder) {
        long __functionAddress = OpenVR.VROverlay.GetOverlaySortOrder;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, punSortOrder);
    }

    /**
     * Gets the sort order of the overlay. See {@link #VROverlay_SetOverlaySortOrder SetOverlaySortOrder} for how this works.
     *
     * @param ulOverlayHandle 
     * @param punSortOrder    
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlaySortOrder(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer punSortOrder) {
        if (CHECKS) {
            check(punSortOrder, 1);
        }
        return nVROverlay_GetOverlaySortOrder(ulOverlayHandle, memAddress(punSortOrder));
    }

    // --- [ VROverlay_SetOverlayWidthInMeters ] ---

    /**
     * Sets the width of the overlay quad in meters. By default overlays are rendered on a quad that is 1 meter across.
     *
     * @param ulOverlayHandle 
     * @param fWidthInMeters  
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayWidthInMeters(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fWidthInMeters) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayWidthInMeters;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, fWidthInMeters);
    }

    // --- [ VROverlay_GetOverlayWidthInMeters ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayWidthInMeters GetOverlayWidthInMeters} */
    public static int nVROverlay_GetOverlayWidthInMeters(long ulOverlayHandle, long pfWidthInMeters) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayWidthInMeters;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pfWidthInMeters);
    }

    /**
     * Returns the width of the overlay quad in meters. By default overlays are rendered on a quad that is 1 meter across.
     *
     * @param ulOverlayHandle 
     * @param pfWidthInMeters 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayWidthInMeters(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfWidthInMeters) {
        if (CHECKS) {
            check(pfWidthInMeters, 1);
        }
        return nVROverlay_GetOverlayWidthInMeters(ulOverlayHandle, memAddress(pfWidthInMeters));
    }

    // --- [ VROverlay_SetOverlayAutoCurveDistanceRangeInMeters ] ---

    /**
     * For high-quality curved overlays only, sets the distance range in meters from the overlay used to automatically curve the surface around the viewer.
     * Min is distance is when the surface will be most curved. Max is when least curved.
     *
     * @param ulOverlayHandle      
     * @param fMinDistanceInMeters 
     * @param fMaxDistanceInMeters 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayAutoCurveDistanceRangeInMeters(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fMinDistanceInMeters, float fMaxDistanceInMeters) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayAutoCurveDistanceRangeInMeters;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, fMinDistanceInMeters, fMaxDistanceInMeters);
    }

    // --- [ VROverlay_GetOverlayAutoCurveDistanceRangeInMeters ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayAutoCurveDistanceRangeInMeters GetOverlayAutoCurveDistanceRangeInMeters} */
    public static int nVROverlay_GetOverlayAutoCurveDistanceRangeInMeters(long ulOverlayHandle, long pfMinDistanceInMeters, long pfMaxDistanceInMeters) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayAutoCurveDistanceRangeInMeters;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, pfMinDistanceInMeters, pfMaxDistanceInMeters);
    }

    /**
     * For high-quality curved overlays only, gets the distance range in meters from the overlay used to automatically curve the surface around the viewer.
     * Min is distance is when the surface will be most curved. Max is when least curved.
     *
     * @param ulOverlayHandle       
     * @param pfMinDistanceInMeters 
     * @param pfMaxDistanceInMeters 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayAutoCurveDistanceRangeInMeters(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfMinDistanceInMeters, @NativeType("float *") FloatBuffer pfMaxDistanceInMeters) {
        if (CHECKS) {
            check(pfMinDistanceInMeters, 1);
            check(pfMaxDistanceInMeters, 1);
        }
        return nVROverlay_GetOverlayAutoCurveDistanceRangeInMeters(ulOverlayHandle, memAddress(pfMinDistanceInMeters), memAddress(pfMaxDistanceInMeters));
    }

    // --- [ VROverlay_SetOverlayTextureColorSpace ] ---

    /**
     * Sets the colorspace the overlay texture's data is in. Defaults to 'auto'. If the texture needs to be resolved, you should call {@link #VROverlay_SetOverlayTexture SetOverlayTexture}
     * with the appropriate colorspace instead.
     *
     * @param ulOverlayHandle    
     * @param eTextureColorSpace one of:<br><table><tr><td>{@link VR#EColorSpace_ColorSpace_Auto}</td><td>{@link VR#EColorSpace_ColorSpace_Gamma}</td></tr><tr><td>{@link VR#EColorSpace_ColorSpace_Linear}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTextureColorSpace(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EColorSpace") int eTextureColorSpace) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTextureColorSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, eTextureColorSpace);
    }

    // --- [ VROverlay_GetOverlayTextureColorSpace ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTextureColorSpace GetOverlayTextureColorSpace} */
    public static int nVROverlay_GetOverlayTextureColorSpace(long ulOverlayHandle, long peTextureColorSpace) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureColorSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, peTextureColorSpace);
    }

    /**
     * Gets the overlay's current colorspace setting.
     *
     * @param ulOverlayHandle     
     * @param peTextureColorSpace 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureColorSpace(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EColorSpace *") IntBuffer peTextureColorSpace) {
        if (CHECKS) {
            check(peTextureColorSpace, 1);
        }
        return nVROverlay_GetOverlayTextureColorSpace(ulOverlayHandle, memAddress(peTextureColorSpace));
    }

    // --- [ VROverlay_SetOverlayTextureBounds ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTextureBounds SetOverlayTextureBounds} */
    public static int nVROverlay_SetOverlayTextureBounds(long ulOverlayHandle, long pOverlayTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTextureBounds;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pOverlayTextureBounds);
    }

    /**
     * Sets the part of the texture to use for the overlay. UV Min is the upper left corner and UV Max is the lower right corner.
     *
     * @param ulOverlayHandle       
     * @param pOverlayTextureBounds 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTextureBounds(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("const VRTextureBounds_t *") VRTextureBounds pOverlayTextureBounds) {
        return nVROverlay_SetOverlayTextureBounds(ulOverlayHandle, pOverlayTextureBounds.address());
    }

    // --- [ VROverlay_GetOverlayTextureBounds ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTextureBounds GetOverlayTextureBounds} */
    public static int nVROverlay_GetOverlayTextureBounds(long ulOverlayHandle, long pOverlayTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureBounds;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pOverlayTextureBounds);
    }

    /**
     * Gets the part of the texture to use for the overlay. UV Min is the upper left corner and UV Max is the lower right corner.
     *
     * @param ulOverlayHandle       
     * @param pOverlayTextureBounds 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureBounds(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VRTextureBounds_t *") VRTextureBounds pOverlayTextureBounds) {
        return nVROverlay_GetOverlayTextureBounds(ulOverlayHandle, pOverlayTextureBounds.address());
    }

    // --- [ VROverlay_GetOverlayRenderModel ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayRenderModel GetOverlayRenderModel} */
    public static int nVROverlay_GetOverlayRenderModel(long ulOverlayHandle, long pchValue, int unBufferSize, long pColor, long pError) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayRenderModel;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPPI(__functionAddress, ulOverlayHandle, pchValue, unBufferSize, pColor, pError);
    }

    /**
     * Gets render model to draw behind this overlay.
     *
     * @param ulOverlayHandle 
     * @param pchValue        
     * @param pColor          
     * @param pError          
     */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayRenderModel(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") ByteBuffer pchValue, @NativeType("HmdColor_t *") HmdColor pColor, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVROverlay_GetOverlayRenderModel(ulOverlayHandle, memAddress(pchValue), pchValue.remaining(), pColor.address(), memAddress(pError));
    }

    // --- [ VROverlay_SetOverlayRenderModel ] ---

    public static int nVROverlay_SetOverlayRenderModel(long ulOverlayHandle, long pchRenderModel, long pColor) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayRenderModel;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, pchRenderModel, pColor);
    }

    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayRenderModel(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") ByteBuffer pchRenderModel, @NativeType("HmdColor_t *") HmdColor pColor) {
        if (CHECKS) {
            checkNT1(pchRenderModel);
        }
        return nVROverlay_SetOverlayRenderModel(ulOverlayHandle, memAddress(pchRenderModel), pColor.address());
    }

    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayRenderModel(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") CharSequence pchRenderModel, @NativeType("HmdColor_t *") HmdColor pColor) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelEncoded = stack.ASCII(pchRenderModel);
            return nVROverlay_SetOverlayRenderModel(ulOverlayHandle, memAddress(pchRenderModelEncoded), pColor.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayTransformType ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformType GetOverlayTransformType} */
    public static int nVROverlay_GetOverlayTransformType(long ulOverlayHandle, long peTransformType) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, peTransformType);
    }

    /**
     * Returns the transform type of this overlay.
     *
     * @param ulOverlayHandle 
     * @param peTransformType 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformType(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayTransformType *") IntBuffer peTransformType) {
        if (CHECKS) {
            check(peTransformType, 1);
        }
        return nVROverlay_GetOverlayTransformType(ulOverlayHandle, memAddress(peTransformType));
    }

    // --- [ VROverlay_SetOverlayTransformAbsolute ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTransformAbsolute SetOverlayTransformAbsolute} */
    public static int nVROverlay_SetOverlayTransformAbsolute(long ulOverlayHandle, int eTrackingOrigin, long pmatTrackingOriginToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform);
    }

    /**
     * Sets the transform to absolute tracking origin.
     *
     * @param ulOverlayHandle                      
     * @param eTrackingOrigin                      one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param pmatTrackingOriginToOverlayTransform 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformAbsolute(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("const HmdMatrix34_t *") HmdMatrix34 pmatTrackingOriginToOverlayTransform) {
        return nVROverlay_SetOverlayTransformAbsolute(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform.address());
    }

    // --- [ VROverlay_GetOverlayTransformAbsolute ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformAbsolute GetOverlayTransformAbsolute} */
    public static int nVROverlay_GetOverlayTransformAbsolute(long ulOverlayHandle, long peTrackingOrigin, long pmatTrackingOriginToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, peTrackingOrigin, pmatTrackingOriginToOverlayTransform);
    }

    /**
     * Gets the transform if it is absolute. Returns an error if the transform is some other type.
     *
     * @param ulOverlayHandle                      
     * @param peTrackingOrigin                     
     * @param pmatTrackingOriginToOverlayTransform 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformAbsolute(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin *") IntBuffer peTrackingOrigin, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTrackingOriginToOverlayTransform) {
        if (CHECKS) {
            check(peTrackingOrigin, 1);
        }
        return nVROverlay_GetOverlayTransformAbsolute(ulOverlayHandle, memAddress(peTrackingOrigin), pmatTrackingOriginToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformTrackedDeviceRelative ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTransformTrackedDeviceRelative SetOverlayTransformTrackedDeviceRelative} */
    public static int nVROverlay_SetOverlayTransformTrackedDeviceRelative(long ulOverlayHandle, int unTrackedDevice, long pmatTrackedDeviceToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformTrackedDeviceRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, unTrackedDevice, pmatTrackedDeviceToOverlayTransform);
    }

    /**
     * Sets the transform to relative to the transform of the specified tracked device.
     *
     * @param ulOverlayHandle                     
     * @param unTrackedDevice                     
     * @param pmatTrackedDeviceToOverlayTransform 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformTrackedDeviceRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t") int unTrackedDevice, @NativeType("const HmdMatrix34_t *") HmdMatrix34 pmatTrackedDeviceToOverlayTransform) {
        return nVROverlay_SetOverlayTransformTrackedDeviceRelative(ulOverlayHandle, unTrackedDevice, pmatTrackedDeviceToOverlayTransform.address());
    }

    // --- [ VROverlay_GetOverlayTransformTrackedDeviceRelative ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformTrackedDeviceRelative GetOverlayTransformTrackedDeviceRelative} */
    public static int nVROverlay_GetOverlayTransformTrackedDeviceRelative(long ulOverlayHandle, long punTrackedDevice, long pmatTrackedDeviceToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformTrackedDeviceRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, punTrackedDevice, pmatTrackedDeviceToOverlayTransform);
    }

    /**
     * Gets the transform if it is relative to a tracked device. Returns an error if the transform is some other type.
     *
     * @param ulOverlayHandle                     
     * @param punTrackedDevice                    
     * @param pmatTrackedDeviceToOverlayTransform 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformTrackedDeviceRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t *") IntBuffer punTrackedDevice, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTrackedDeviceToOverlayTransform) {
        if (CHECKS) {
            check(punTrackedDevice, 1);
        }
        return nVROverlay_GetOverlayTransformTrackedDeviceRelative(ulOverlayHandle, memAddress(punTrackedDevice), pmatTrackedDeviceToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformTrackedDeviceComponent ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTransformTrackedDeviceComponent SetOverlayTransformTrackedDeviceComponent} */
    public static int nVROverlay_SetOverlayTransformTrackedDeviceComponent(long ulOverlayHandle, int unDeviceIndex, long pchComponentName) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformTrackedDeviceComponent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, unDeviceIndex, pchComponentName);
    }

    /**
     * Sets the transform to draw the overlay on a rendermodel component mesh instead of a quad. This will only draw when the system is drawing the device.
     * Overlays with this transform type cannot receive mouse events.
     *
     * @param ulOverlayHandle  
     * @param unDeviceIndex    
     * @param pchComponentName 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformTrackedDeviceComponent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("const char *") ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchComponentName);
        }
        return nVROverlay_SetOverlayTransformTrackedDeviceComponent(ulOverlayHandle, unDeviceIndex, memAddress(pchComponentName));
    }

    /**
     * Sets the transform to draw the overlay on a rendermodel component mesh instead of a quad. This will only draw when the system is drawing the device.
     * Overlays with this transform type cannot receive mouse events.
     *
     * @param ulOverlayHandle  
     * @param unDeviceIndex    
     * @param pchComponentName 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformTrackedDeviceComponent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("const char *") CharSequence pchComponentName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchComponentNameEncoded = stack.ASCII(pchComponentName);
            return nVROverlay_SetOverlayTransformTrackedDeviceComponent(ulOverlayHandle, unDeviceIndex, memAddress(pchComponentNameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayTransformTrackedDeviceComponent ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformTrackedDeviceComponent GetOverlayTransformTrackedDeviceComponent} */
    public static int nVROverlay_GetOverlayTransformTrackedDeviceComponent(long ulOverlayHandle, long punDeviceIndex, long pchComponentName, int unComponentNameSize) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformTrackedDeviceComponent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, punDeviceIndex, pchComponentName, unComponentNameSize);
    }

    /**
     * Gets the transform information when the overlay is rendering on a component.
     *
     * @param ulOverlayHandle  
     * @param punDeviceIndex   
     * @param pchComponentName 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformTrackedDeviceComponent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t *") IntBuffer punDeviceIndex, @NativeType("char *") ByteBuffer pchComponentName) {
        if (CHECKS) {
            check(punDeviceIndex, 1);
        }
        return nVROverlay_GetOverlayTransformTrackedDeviceComponent(ulOverlayHandle, memAddress(punDeviceIndex), memAddress(pchComponentName), pchComponentName.remaining());
    }

    // --- [ VROverlay_GetOverlayTransformOverlayRelative ] ---

    public static int nVROverlay_GetOverlayTransformOverlayRelative(long ulOverlayHandle, long ulOverlayHandleParent, long pmatParentOverlayToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformOverlayRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, ulOverlayHandleParent, pmatParentOverlayToOverlayTransform);
    }

    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformOverlayRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayHandle_t *") LongBuffer ulOverlayHandleParent, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatParentOverlayToOverlayTransform) {
        if (CHECKS) {
            check(ulOverlayHandleParent, 1);
        }
        return nVROverlay_GetOverlayTransformOverlayRelative(ulOverlayHandle, memAddress(ulOverlayHandleParent), pmatParentOverlayToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformOverlayRelative ] ---

    public static int nVROverlay_SetOverlayTransformOverlayRelative(long ulOverlayHandle, long ulOverlayHandleParent, long pmatParentOverlayToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformOverlayRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJPI(__functionAddress, ulOverlayHandle, ulOverlayHandleParent, pmatParentOverlayToOverlayTransform);
    }

    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformOverlayRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayHandle_t") long ulOverlayHandleParent, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatParentOverlayToOverlayTransform) {
        return nVROverlay_SetOverlayTransformOverlayRelative(ulOverlayHandle, ulOverlayHandleParent, pmatParentOverlayToOverlayTransform.address());
    }

    // --- [ VROverlay_ShowOverlay ] ---

    /**
     * Shows the VR overlay. For dashboard overlays, only the Dashboard Manager is allowed to call this.
     *
     * @param ulOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.ShowOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_HideOverlay ] ---

    /**
     * Hides the VR overlay. For dashboard overlays, only the Dashboard Manager is allowed to call this.
     *
     * @param ulOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_HideOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.HideOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_IsOverlayVisible ] ---

    /**
     * Returns true if the overlay is visible.
     *
     * @param ulOverlayHandle 
     */
    @NativeType("bool")
    public static boolean VROverlay_IsOverlayVisible(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsOverlayVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_GetTransformForOverlayCoordinates ] ---

    /** Unsafe version of: {@link #VROverlay_GetTransformForOverlayCoordinates GetTransformForOverlayCoordinates} */
    public static int nVROverlay_GetTransformForOverlayCoordinates(long ulOverlayHandle, int eTrackingOrigin, long coordinatesInOverlay, long pmatTransform) {
        long __functionAddress = OpenVR.VROverlay.GetTransformForOverlayCoordinates;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, eTrackingOrigin, coordinatesInOverlay, pmatTransform);
    }

    /**
     * Get the transform in 3d space associated with a specific 2d point in the overlay's coordinate space (where 0,0 is the lower left). -Z points out of the
     * overlay.
     *
     * @param ulOverlayHandle      
     * @param eTrackingOrigin      one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param coordinatesInOverlay 
     * @param pmatTransform        
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetTransformForOverlayCoordinates(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdVector2_t") HmdVector2 coordinatesInOverlay, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTransform) {
        return nVROverlay_GetTransformForOverlayCoordinates(ulOverlayHandle, eTrackingOrigin, coordinatesInOverlay.address(), pmatTransform.address());
    }

    // --- [ VROverlay_PollNextOverlayEvent ] ---

    /** Unsafe version of: {@link #VROverlay_PollNextOverlayEvent PollNextOverlayEvent} */
    public static boolean nVROverlay_PollNextOverlayEvent(long ulOverlayHandle, long pEvent, int uncbVREvent) {
        long __functionAddress = OpenVR.VROverlay.PollNextOverlayEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPZ(__functionAddress, ulOverlayHandle, pEvent, uncbVREvent);
    }

    /**
     * Returns true and fills the event with the next event on the overlay's event queue, if there is one.
     * 
     * <p>If there are no events this method returns false. {@code uncbVREvent} should be the size in bytes of the {@link VREvent} struct.</p>
     *
     * @param ulOverlayHandle 
     * @param pEvent          
     * @param uncbVREvent     
     */
    @NativeType("bool")
    public static boolean VROverlay_PollNextOverlayEvent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VREvent_t *") VREvent pEvent, @NativeType("uint32_t") int uncbVREvent) {
        return nVROverlay_PollNextOverlayEvent(ulOverlayHandle, pEvent.address(), uncbVREvent);
    }

    /**
     * Returns true and fills the event with the next event on the overlay's event queue, if there is one.
     * 
     * <p>If there are no events this method returns false. {@code uncbVREvent} should be the size in bytes of the {@link VREvent} struct.</p>
     *
     * @param ulOverlayHandle 
     * @param pEvent          
     */
    @NativeType("bool")
    public static boolean VROverlay_PollNextOverlayEvent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VREvent_t *") VREvent pEvent) {
        return nVROverlay_PollNextOverlayEvent(ulOverlayHandle, pEvent.address(), VREvent.SIZEOF);
    }

    // --- [ VROverlay_GetOverlayInputMethod ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayInputMethod GetOverlayInputMethod} */
    public static int nVROverlay_GetOverlayInputMethod(long ulOverlayHandle, long peInputMethod) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayInputMethod;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, peInputMethod);
    }

    /**
     * Returns the current input settings for the specified overlay.
     *
     * @param ulOverlayHandle 
     * @param peInputMethod   
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayInputMethod(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayInputMethod *") IntBuffer peInputMethod) {
        if (CHECKS) {
            check(peInputMethod, 1);
        }
        return nVROverlay_GetOverlayInputMethod(ulOverlayHandle, memAddress(peInputMethod));
    }

    // --- [ VROverlay_SetOverlayInputMethod ] ---

    /**
     * Sets the input settings for the specified overlay.
     *
     * @param ulOverlayHandle 
     * @param eInputMethod    one of:<br><table><tr><td>{@link VR#VROverlayInputMethod_None}</td><td>{@link VR#VROverlayInputMethod_Mouse}</td></tr><tr><td>{@link VR#VROverlayInputMethod_DualAnalog}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayInputMethod(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayInputMethod") int eInputMethod) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayInputMethod;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, eInputMethod);
    }

    // --- [ VROverlay_GetOverlayMouseScale ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayMouseScale GetOverlayMouseScale} */
    public static int nVROverlay_GetOverlayMouseScale(long ulOverlayHandle, long pvecMouseScale) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayMouseScale;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pvecMouseScale);
    }

    /**
     * Gets the mouse scaling factor that is used for mouse events. The actual texture may be a different size, but this is typically the size of the
     * underlying UI in pixels.
     *
     * @param ulOverlayHandle 
     * @param pvecMouseScale  
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayMouseScale(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t *") HmdVector2 pvecMouseScale) {
        return nVROverlay_GetOverlayMouseScale(ulOverlayHandle, pvecMouseScale.address());
    }

    // --- [ VROverlay_SetOverlayMouseScale ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayMouseScale SetOverlayMouseScale} */
    public static int nVROverlay_SetOverlayMouseScale(long ulOverlayHandle, long pvecMouseScale) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayMouseScale;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pvecMouseScale);
    }

    /**
     * Sets the mouse scaling factor that is used for mouse events. The actual texture may be a different size, but this is typically the size of the
     * underlying UI in pixels (not in world space).
     *
     * @param ulOverlayHandle 
     * @param pvecMouseScale  
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayMouseScale(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("const HmdVector2_t *") HmdVector2 pvecMouseScale) {
        return nVROverlay_SetOverlayMouseScale(ulOverlayHandle, pvecMouseScale.address());
    }

    // --- [ VROverlay_ComputeOverlayIntersection ] ---

    /** Unsafe version of: {@link #VROverlay_ComputeOverlayIntersection ComputeOverlayIntersection} */
    public static boolean nVROverlay_ComputeOverlayIntersection(long ulOverlayHandle, long pParams, long pResults) {
        long __functionAddress = OpenVR.VROverlay.ComputeOverlayIntersection;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPZ(__functionAddress, ulOverlayHandle, pParams, pResults);
    }

    /**
     * Computes the overlay-space pixel coordinates of where the ray intersects the overlay with the specified settings. Returns false if there is no
     * intersection.
     *
     * @param ulOverlayHandle 
     * @param pParams         
     * @param pResults        
     */
    @NativeType("bool")
    public static boolean VROverlay_ComputeOverlayIntersection(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("const VROverlayIntersectionParams_t *") VROverlayIntersectionParams pParams, @NativeType("VROverlayIntersectionResults_t *") VROverlayIntersectionResults pResults) {
        return nVROverlay_ComputeOverlayIntersection(ulOverlayHandle, pParams.address(), pResults.address());
    }

    // --- [ VROverlay_IsHoverTargetOverlay ] ---

    /**
     * Returns true if the specified overlay is the hover target. An overlay is the hover target when it is the last overlay "moused over" by the virtual
     * mouse pointer.
     *
     * @param ulOverlayHandle 
     */
    @NativeType("bool")
    public static boolean VROverlay_IsHoverTargetOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsHoverTargetOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_GetGamepadFocusOverlay ] ---

    /** Returns the current Gamepad focus overlay. */
    @NativeType("VROverlayHandle_t")
    public static long VROverlay_GetGamepadFocusOverlay() {
        long __functionAddress = OpenVR.VROverlay.GetGamepadFocusOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(__functionAddress);
    }

    // --- [ VROverlay_SetGamepadFocusOverlay ] ---

    /**
     * Sets the current Gamepad focus overlay.
     *
     * @param ulNewFocusOverlay 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetGamepadFocusOverlay(@NativeType("VROverlayHandle_t") long ulNewFocusOverlay) {
        long __functionAddress = OpenVR.VROverlay.SetGamepadFocusOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulNewFocusOverlay);
    }

    // --- [ VROverlay_SetOverlayNeighbor ] ---

    /**
     * Sets an overlay's neighbor. This will also set the neighbor of the "to" overlay to point back to the "from" overlay. If an overlay's neighbor is set to
     * invalid both ends will be cleared.
     * "
     *
     * @param eDirection one of:<br><table><tr><td>{@link VR#EOverlayDirection_OverlayDirection_Up}</td><td>{@link VR#EOverlayDirection_OverlayDirection_Down}</td></tr><tr><td>{@link VR#EOverlayDirection_OverlayDirection_Left}</td><td>{@link VR#EOverlayDirection_OverlayDirection_Right}</td></tr><tr><td>{@link VR#EOverlayDirection_OverlayDirection_Count}</td></tr></table>
     * @param ulFrom     
     * @param ulTo       
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayNeighbor(@NativeType("EOverlayDirection") int eDirection, @NativeType("VROverlayHandle_t") long ulFrom, @NativeType("VROverlayHandle_t") long ulTo) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayNeighbor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(__functionAddress, eDirection, ulFrom, ulTo);
    }

    // --- [ VROverlay_MoveGamepadFocusToNeighbor ] ---

    /**
     * Changes the Gamepad focus from one overlay to one of its neighbors.
     *
     * @param eDirection one of:<br><table><tr><td>{@link VR#EOverlayDirection_OverlayDirection_Up}</td><td>{@link VR#EOverlayDirection_OverlayDirection_Down}</td></tr><tr><td>{@link VR#EOverlayDirection_OverlayDirection_Left}</td><td>{@link VR#EOverlayDirection_OverlayDirection_Right}</td></tr><tr><td>{@link VR#EOverlayDirection_OverlayDirection_Count}</td></tr></table>
     * @param ulFrom     
     *
     * @return {@link VR#EVROverlayError_VROverlayError_NoNeighbor} if there is no neighbor in that direction
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_MoveGamepadFocusToNeighbor(@NativeType("EOverlayDirection") int eDirection, @NativeType("VROverlayHandle_t") long ulFrom) {
        long __functionAddress = OpenVR.VROverlay.MoveGamepadFocusToNeighbor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, eDirection, ulFrom);
    }

    // --- [ VROverlay_SetOverlayDualAnalogTransform ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayDualAnalogTransform SetOverlayDualAnalogTransform} */
    public static int nVROverlay_SetOverlayDualAnalogTransform(long ulOverlay, int eWhich, long pvCenter, float fRadius) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayDualAnalogTransform;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlay, eWhich, pvCenter, fRadius);
    }

    /**
     * Sets the analog input to Dual Analog coordinate scale for the specified overlay.
     *
     * @param ulOverlay 
     * @param eWhich    one of:<br><table><tr><td>{@link VR#EDualAnalogWhich_k_EDualAnalog_Left}</td><td>{@link VR#EDualAnalogWhich_k_EDualAnalog_Right}</td></tr></table>
     * @param pvCenter  
     * @param fRadius   
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayDualAnalogTransform(@NativeType("VROverlayHandle_t") long ulOverlay, @NativeType("EDualAnalogWhich") int eWhich, @NativeType("HmdVector2_t *") HmdVector2 pvCenter, float fRadius) {
        return nVROverlay_SetOverlayDualAnalogTransform(ulOverlay, eWhich, pvCenter.address(), fRadius);
    }

    // --- [ VROverlay_GetOverlayDualAnalogTransform ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayDualAnalogTransform GetOverlayDualAnalogTransform} */
    public static int nVROverlay_GetOverlayDualAnalogTransform(long ulOverlay, int eWhich, long pvCenter, long pfRadius) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayDualAnalogTransform;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlay, eWhich, pvCenter, pfRadius);
    }

    /**
     * Gets the analog input to Dual Analog coordinate scale for the specified overlay.
     *
     * @param ulOverlay 
     * @param eWhich    one of:<br><table><tr><td>{@link VR#EDualAnalogWhich_k_EDualAnalog_Left}</td><td>{@link VR#EDualAnalogWhich_k_EDualAnalog_Right}</td></tr></table>
     * @param pvCenter  
     * @param pfRadius  
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayDualAnalogTransform(@NativeType("VROverlayHandle_t") long ulOverlay, @NativeType("EDualAnalogWhich") int eWhich, @NativeType("HmdVector2_t *") HmdVector2 pvCenter, @NativeType("float *") FloatBuffer pfRadius) {
        if (CHECKS) {
            check(pfRadius, 1);
        }
        return nVROverlay_GetOverlayDualAnalogTransform(ulOverlay, eWhich, pvCenter.address(), memAddress(pfRadius));
    }

    // --- [ VROverlay_SetOverlayTexture ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTexture SetOverlayTexture} */
    public static int nVROverlay_SetOverlayTexture(long ulOverlayHandle, long pTexture) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
            Texture.validate(pTexture);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pTexture);
    }

    /**
     * Texture to draw for the overlay. This function can only be called by the overlay's creator or renderer process (see {@link #VROverlay_SetOverlayRenderingPid SetOverlayRenderingPid}).
     *
     * @param ulOverlayHandle 
     * @param pTexture        
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTexture(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("const Texture_t *") Texture pTexture) {
        return nVROverlay_SetOverlayTexture(ulOverlayHandle, pTexture.address());
    }

    // --- [ VROverlay_ClearOverlayTexture ] ---

    /**
     * Use this to tell the overlay system to release the texture set for this overlay.
     *
     * @param ulOverlayHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ClearOverlayTexture(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.ClearOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_SetOverlayRaw ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayRaw SetOverlayRaw} */
    public static int nVROverlay_SetOverlayRaw(long ulOverlayHandle, long pvBuffer, int unWidth, int unHeight, int unDepth) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayRaw;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pvBuffer, unWidth, unHeight, unDepth);
    }

    /**
     * Separate interface for providing the data as a stream of bytes, but there is an upper bound on data that can be sent. This function can only be called
     * by the overlay's renderer process.
     *
     * @param ulOverlayHandle 
     * @param pvBuffer        
     * @param unWidth         
     * @param unHeight        
     * @param unDepth         
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayRaw(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void *") ByteBuffer pvBuffer, @NativeType("uint32_t") int unWidth, @NativeType("uint32_t") int unHeight, @NativeType("uint32_t") int unDepth) {
        return nVROverlay_SetOverlayRaw(ulOverlayHandle, memAddress(pvBuffer), unWidth, unHeight, unDepth);
    }

    // --- [ VROverlay_SetOverlayFromFile ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayFromFile SetOverlayFromFile} */
    public static int nVROverlay_SetOverlayFromFile(long ulOverlayHandle, long pchFilePath) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayFromFile;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pchFilePath);
    }

    /**
     * Separate interface for providing the image through a filename: can be png or jpg, and should not be bigger than 1920x1080. This function can only be
     * called by the overlay's renderer process
     *
     * @param ulOverlayHandle 
     * @param pchFilePath     
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayFromFile(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("const char *") ByteBuffer pchFilePath) {
        if (CHECKS) {
            checkNT1(pchFilePath);
        }
        return nVROverlay_SetOverlayFromFile(ulOverlayHandle, memAddress(pchFilePath));
    }

    /**
     * Separate interface for providing the image through a filename: can be png or jpg, and should not be bigger than 1920x1080. This function can only be
     * called by the overlay's renderer process
     *
     * @param ulOverlayHandle 
     * @param pchFilePath     
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayFromFile(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("const char *") CharSequence pchFilePath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchFilePathEncoded = stack.ASCII(pchFilePath);
            return nVROverlay_SetOverlayFromFile(ulOverlayHandle, memAddress(pchFilePathEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayTexture ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTexture GetOverlayTexture} */
    public static int nVROverlay_GetOverlayTexture(long ulOverlayHandle, long pNativeTextureHandle, long pNativeTextureRef, long pWidth, long pHeight, long pNativeFormat, long pAPIType, long pColorSpace, long pTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
            check(pNativeTextureRef);
        }
        return callJPPPPPPPPI(__functionAddress, ulOverlayHandle, pNativeTextureHandle, pNativeTextureRef, pWidth, pHeight, pNativeFormat, pAPIType, pColorSpace, pTextureBounds);
    }

    /**
     * Get the native texture handle/device for an overlay you have created.
     * 
     * <p>On windows this handle will be a ID3D11ShaderResourceView with a ID3D11Texture2D bound.</p>
     * 
     * <p>The texture will always be sized to match the backing texture you supplied in SetOverlayTexture above.</p>
     * 
     * <p>You MUST call {@link #VROverlay_ReleaseNativeOverlayHandle ReleaseNativeOverlayHandle} with {@code pNativeTextureHandle} once you are done with this texture.</p>
     * 
     * <p>{@code pNativeTextureHandle} is an OUTPUT, it will be a pointer to a {@code ID3D11ShaderResourceView *}.
     * {@code pNativeTextureRef} is an INPUT and should be a {@code ID3D11Resource *}. The device used by {@code pNativeTextureRef} will be used to bind
     * {@code pNativeTextureHandle}.</p>
     *
     * @param ulOverlayHandle      
     * @param pNativeTextureHandle 
     * @param pNativeTextureRef    
     * @param pWidth               
     * @param pHeight              
     * @param pNativeFormat        
     * @param pAPIType             
     * @param pColorSpace          
     * @param pTextureBounds       
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTexture(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void **") PointerBuffer pNativeTextureHandle, @NativeType("void *") long pNativeTextureRef, @NativeType("uint32_t *") IntBuffer pWidth, @NativeType("uint32_t *") IntBuffer pHeight, @NativeType("uint32_t *") IntBuffer pNativeFormat, @NativeType("ETextureType *") IntBuffer pAPIType, @NativeType("EColorSpace *") IntBuffer pColorSpace, @NativeType("VRTextureBounds_t *") VRTextureBounds pTextureBounds) {
        if (CHECKS) {
            check(pNativeTextureHandle, 1);
            check(pWidth, 1);
            check(pHeight, 1);
            check(pNativeFormat, 1);
            check(pAPIType, 1);
            check(pColorSpace, 1);
        }
        return nVROverlay_GetOverlayTexture(ulOverlayHandle, memAddress(pNativeTextureHandle), pNativeTextureRef, memAddress(pWidth), memAddress(pHeight), memAddress(pNativeFormat), memAddress(pAPIType), memAddress(pColorSpace), pTextureBounds.address());
    }

    // --- [ VROverlay_ReleaseNativeOverlayHandle ] ---

    /**
     * Release the {@code pNativeTextureHandle} provided from the {@link #VROverlay_GetOverlayTexture GetOverlayTexture} call, this allows the system to free the underlying GPU resources for
     * this object, so only do it once you stop rendering this texture.
     *
     * @param ulOverlayHandle      
     * @param pNativeTextureHandle 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ReleaseNativeOverlayHandle(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void *") long pNativeTextureHandle) {
        long __functionAddress = OpenVR.VROverlay.ReleaseNativeOverlayHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(pNativeTextureHandle);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pNativeTextureHandle);
    }

    // --- [ VROverlay_GetOverlayTextureSize ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTextureSize GetOverlayTextureSize} */
    public static int nVROverlay_GetOverlayTextureSize(long ulOverlayHandle, long pWidth, long pHeight) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, ulOverlayHandle, pWidth, pHeight);
    }

    /**
     * Get the size of the overlay texture.
     *
     * @param ulOverlayHandle 
     * @param pWidth          
     * @param pHeight         
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureSize(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer pWidth, @NativeType("uint32_t *") IntBuffer pHeight) {
        if (CHECKS) {
            check(pWidth, 1);
            check(pHeight, 1);
        }
        return nVROverlay_GetOverlayTextureSize(ulOverlayHandle, memAddress(pWidth), memAddress(pHeight));
    }

    // --- [ VROverlay_CreateDashboardOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_CreateDashboardOverlay CreateDashboardOverlay} */
    public static int nVROverlay_CreateDashboardOverlay(long pchOverlayKey, long pchOverlayFriendlyName, long pMainHandle, long pThumbnailHandle) {
        long __functionAddress = OpenVR.VROverlay.CreateDashboardOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(__functionAddress, pchOverlayKey, pchOverlayFriendlyName, pMainHandle, pThumbnailHandle);
    }

    /**
     * Creates a dashboard overlay and returns its handle.
     *
     * @param pchOverlayKey          
     * @param pchOverlayFriendlyName 
     * @param pMainHandle            
     * @param pThumbnailHandle       
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateDashboardOverlay(@NativeType("const char *") ByteBuffer pchOverlayKey, @NativeType("const char *") ByteBuffer pchOverlayFriendlyName, @NativeType("VROverlayHandle_t *") LongBuffer pMainHandle, @NativeType("VROverlayHandle_t *") LongBuffer pThumbnailHandle) {
        if (CHECKS) {
            checkNT1(pchOverlayKey);
            checkNT1(pchOverlayFriendlyName);
            check(pMainHandle, 1);
            check(pThumbnailHandle, 1);
        }
        return nVROverlay_CreateDashboardOverlay(memAddress(pchOverlayKey), memAddress(pchOverlayFriendlyName), memAddress(pMainHandle), memAddress(pThumbnailHandle));
    }

    /**
     * Creates a dashboard overlay and returns its handle.
     *
     * @param pchOverlayKey          
     * @param pchOverlayFriendlyName 
     * @param pMainHandle            
     * @param pThumbnailHandle       
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateDashboardOverlay(@NativeType("const char *") CharSequence pchOverlayKey, @NativeType("const char *") CharSequence pchOverlayFriendlyName, @NativeType("VROverlayHandle_t *") LongBuffer pMainHandle, @NativeType("VROverlayHandle_t *") LongBuffer pThumbnailHandle) {
        if (CHECKS) {
            check(pMainHandle, 1);
            check(pThumbnailHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchOverlayKeyEncoded = stack.ASCII(pchOverlayKey);
            ByteBuffer pchOverlayFriendlyNameEncoded = stack.ASCII(pchOverlayFriendlyName);
            return nVROverlay_CreateDashboardOverlay(memAddress(pchOverlayKeyEncoded), memAddress(pchOverlayFriendlyNameEncoded), memAddress(pMainHandle), memAddress(pThumbnailHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_IsDashboardVisible ] ---

    /** Returns true if the dashboard is visible. */
    @NativeType("bool")
    public static boolean VROverlay_IsDashboardVisible() {
        long __functionAddress = OpenVR.VROverlay.IsDashboardVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VROverlay_IsActiveDashboardOverlay ] ---

    /**
     * Returns true if the dashboard is visible and the specified overlay is the active system Overlay.
     *
     * @param ulOverlayHandle 
     */
    @NativeType("bool")
    public static boolean VROverlay_IsActiveDashboardOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsActiveDashboardOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(__functionAddress, ulOverlayHandle);
    }

    // --- [ VROverlay_SetDashboardOverlaySceneProcess ] ---

    /**
     * Sets the dashboard overlay to only appear when the specified process ID has scene focus.
     *
     * @param ulOverlayHandle 
     * @param unProcessId     
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetDashboardOverlaySceneProcess(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unProcessId) {
        long __functionAddress = OpenVR.VROverlay.SetDashboardOverlaySceneProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, ulOverlayHandle, unProcessId);
    }

    // --- [ VROverlay_GetDashboardOverlaySceneProcess ] ---

    /** Unsafe version of: {@link #VROverlay_GetDashboardOverlaySceneProcess GetDashboardOverlaySceneProcess} */
    public static int nVROverlay_GetDashboardOverlaySceneProcess(long ulOverlayHandle, long punProcessId) {
        long __functionAddress = OpenVR.VROverlay.GetDashboardOverlaySceneProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, punProcessId);
    }

    /**
     * Gets the process ID that this dashboard overlay requires to have scene focus.
     *
     * @param ulOverlayHandle 
     * @param punProcessId    
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetDashboardOverlaySceneProcess(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer punProcessId) {
        if (CHECKS) {
            check(punProcessId, 1);
        }
        return nVROverlay_GetDashboardOverlaySceneProcess(ulOverlayHandle, memAddress(punProcessId));
    }

    // --- [ VROverlay_ShowDashboard ] ---

    /** Unsafe version of: {@link #VROverlay_ShowDashboard ShowDashboard} */
    public static void nVROverlay_ShowDashboard(long pchOverlayToShow) {
        long __functionAddress = OpenVR.VROverlay.ShowDashboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, pchOverlayToShow);
    }

    /**
     * Shows the dashboard.
     *
     * @param pchOverlayToShow 
     */
    public static void VROverlay_ShowDashboard(@NativeType("const char *") ByteBuffer pchOverlayToShow) {
        if (CHECKS) {
            checkNT1(pchOverlayToShow);
        }
        nVROverlay_ShowDashboard(memAddress(pchOverlayToShow));
    }

    /**
     * Shows the dashboard.
     *
     * @param pchOverlayToShow 
     */
    public static void VROverlay_ShowDashboard(@NativeType("const char *") CharSequence pchOverlayToShow) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchOverlayToShowEncoded = stack.ASCII(pchOverlayToShow);
            nVROverlay_ShowDashboard(memAddress(pchOverlayToShowEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetPrimaryDashboardDevice ] ---

    /** Returns the tracked device that has the laser pointer in the dashboard. */
    @NativeType("TrackedDeviceIndex_t")
    public static int VROverlay_GetPrimaryDashboardDevice() {
        long __functionAddress = OpenVR.VROverlay.GetPrimaryDashboardDevice;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VROverlay_ShowKeyboard ] ---

    /** Unsafe version of: {@link #VROverlay_ShowKeyboard ShowKeyboard} */
    public static int nVROverlay_ShowKeyboard(int eInputMode, int eLineInputMode, long pchDescription, int unCharMax, long pchExistingText, boolean bUseMinimalMode, long uUserValue) {
        long __functionAddress = OpenVR.VROverlay.ShowKeyboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJI(__functionAddress, eInputMode, eLineInputMode, pchDescription, unCharMax, pchExistingText, bUseMinimalMode, uUserValue);
    }

    /**
     * Show the virtual keyboard to accept input.
     *
     * @param eInputMode      one of:<br><table><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModePassword}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</td></tr></table>
     * @param eLineInputMode  one of:<br><table><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</td></tr><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</td></tr></table>
     * @param pchDescription  
     * @param unCharMax       
     * @param pchExistingText 
     * @param bUseMinimalMode 
     * @param uUserValue      
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboard(@NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("const char *") ByteBuffer pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("const char *") ByteBuffer pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        if (CHECKS) {
            checkNT1(pchDescription);
            checkNT1(pchExistingText);
        }
        return nVROverlay_ShowKeyboard(eInputMode, eLineInputMode, memAddress(pchDescription), unCharMax, memAddress(pchExistingText), bUseMinimalMode, uUserValue);
    }

    /**
     * Show the virtual keyboard to accept input.
     *
     * @param eInputMode      one of:<br><table><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModePassword}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</td></tr></table>
     * @param eLineInputMode  one of:<br><table><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</td></tr><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</td></tr></table>
     * @param pchDescription  
     * @param unCharMax       
     * @param pchExistingText 
     * @param bUseMinimalMode 
     * @param uUserValue      
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboard(@NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("const char *") CharSequence pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("const char *") CharSequence pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchDescriptionEncoded = stack.ASCII(pchDescription);
            ByteBuffer pchExistingTextEncoded = stack.ASCII(pchExistingText);
            return nVROverlay_ShowKeyboard(eInputMode, eLineInputMode, memAddress(pchDescriptionEncoded), unCharMax, memAddress(pchExistingTextEncoded), bUseMinimalMode, uUserValue);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_ShowKeyboardForOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_ShowKeyboardForOverlay ShowKeyboardForOverlay} */
    public static int nVROverlay_ShowKeyboardForOverlay(long ulOverlayHandle, int eInputMode, int eLineInputMode, long pchDescription, int unCharMax, long pchExistingText, boolean bUseMinimalMode, long uUserValue) {
        long __functionAddress = OpenVR.VROverlay.ShowKeyboardForOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPJI(__functionAddress, ulOverlayHandle, eInputMode, eLineInputMode, pchDescription, unCharMax, pchExistingText, bUseMinimalMode, uUserValue);
    }

    /**
     * @param ulOverlayHandle 
     * @param eInputMode      one of:<br><table><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModePassword}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</td></tr></table>
     * @param eLineInputMode  one of:<br><table><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</td></tr><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</td></tr></table>
     * @param pchDescription  
     * @param unCharMax       
     * @param pchExistingText 
     * @param bUseMinimalMode 
     * @param uUserValue      
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboardForOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("const char *") ByteBuffer pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("const char *") ByteBuffer pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        if (CHECKS) {
            checkNT1(pchDescription);
            checkNT1(pchExistingText);
        }
        return nVROverlay_ShowKeyboardForOverlay(ulOverlayHandle, eInputMode, eLineInputMode, memAddress(pchDescription), unCharMax, memAddress(pchExistingText), bUseMinimalMode, uUserValue);
    }

    /**
     * @param ulOverlayHandle 
     * @param eInputMode      one of:<br><table><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModePassword}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</td></tr></table>
     * @param eLineInputMode  one of:<br><table><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</td></tr><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</td></tr></table>
     * @param pchDescription  
     * @param unCharMax       
     * @param pchExistingText 
     * @param bUseMinimalMode 
     * @param uUserValue      
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboardForOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("const char *") CharSequence pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("const char *") CharSequence pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchDescriptionEncoded = stack.ASCII(pchDescription);
            ByteBuffer pchExistingTextEncoded = stack.ASCII(pchExistingText);
            return nVROverlay_ShowKeyboardForOverlay(ulOverlayHandle, eInputMode, eLineInputMode, memAddress(pchDescriptionEncoded), unCharMax, memAddress(pchExistingTextEncoded), bUseMinimalMode, uUserValue);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetKeyboardText ] ---

    /** Unsafe version of: {@link #VROverlay_GetKeyboardText GetKeyboardText} */
    public static int nVROverlay_GetKeyboardText(long pchText, int cchText) {
        long __functionAddress = OpenVR.VROverlay.GetKeyboardText;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(__functionAddress, pchText, cchText);
    }

    /**
     * Get the text that was entered into the text input.
     *
     * @param pchText 
     */
    @NativeType("uint32_t")
    public static int VROverlay_GetKeyboardText(@NativeType("char *") ByteBuffer pchText) {
        return nVROverlay_GetKeyboardText(memAddressSafe(pchText), remainingSafe(pchText));
    }

    /**
     * Get the text that was entered into the text input.
     *
     * @param cchText 
     */
    @NativeType("uint32_t")
    public static String VROverlay_GetKeyboardText(@NativeType("uint32_t") int cchText) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchText = stack.malloc(cchText);
            int __result = nVROverlay_GetKeyboardText(memAddress(pchText), cchText);
            return memASCII(pchText, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_HideKeyboard ] ---

    /** Hide the virtual keyboard. */
    public static void VROverlay_HideKeyboard() {
        long __functionAddress = OpenVR.VROverlay.HideKeyboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VROverlay_SetKeyboardTransformAbsolute ] ---

    /** Unsafe version of: {@link #VROverlay_SetKeyboardTransformAbsolute SetKeyboardTransformAbsolute} */
    public static void nVROverlay_SetKeyboardTransformAbsolute(int eTrackingOrigin, long pmatTrackingOriginToKeyboardTransform) {
        long __functionAddress = OpenVR.VROverlay.SetKeyboardTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, eTrackingOrigin, pmatTrackingOriginToKeyboardTransform);
    }

    /**
     * Set the position of the keyboard in world space.
     *
     * @param eTrackingOrigin                       one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param pmatTrackingOriginToKeyboardTransform 
     */
    public static void VROverlay_SetKeyboardTransformAbsolute(@NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("const HmdMatrix34_t *") HmdMatrix34 pmatTrackingOriginToKeyboardTransform) {
        nVROverlay_SetKeyboardTransformAbsolute(eTrackingOrigin, pmatTrackingOriginToKeyboardTransform.address());
    }

    // --- [ VROverlay_SetKeyboardPositionForOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_SetKeyboardPositionForOverlay SetKeyboardPositionForOverlay} */
    public static void nVROverlay_SetKeyboardPositionForOverlay(long ulOverlayHandle, long avoidRect) {
        long __functionAddress = OpenVR.VROverlay.SetKeyboardPositionForOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        callJPV(__functionAddress, ulOverlayHandle, avoidRect);
    }

    /**
     * Set the position of the keyboard in overlay space by telling it to avoid a rectangle in the overlay. Rectangle coords have (0,0) in the bottom left.
     *
     * @param ulOverlayHandle 
     * @param avoidRect       
     */
    public static void VROverlay_SetKeyboardPositionForOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdRect2_t") HmdRect2 avoidRect) {
        nVROverlay_SetKeyboardPositionForOverlay(ulOverlayHandle, avoidRect.address());
    }

    // --- [ VROverlay_SetOverlayIntersectionMask ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayIntersectionMask SetOverlayIntersectionMask} */
    public static int nVROverlay_SetOverlayIntersectionMask(long ulOverlayHandle, long pMaskPrimitives, int unNumMaskPrimitives, int unPrimitiveSize) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayIntersectionMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pMaskPrimitives, unNumMaskPrimitives, unPrimitiveSize);
    }

    /**
     * Sets a list of primitives to be used for controller ray intersection typically the size of the underlying UI in pixels(not in world space).
     *
     * @param ulOverlayHandle 
     * @param pMaskPrimitives 
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayIntersectionMask(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayIntersectionMaskPrimitive_t *") VROverlayIntersectionMaskPrimitive.Buffer pMaskPrimitives) {
        return nVROverlay_SetOverlayIntersectionMask(ulOverlayHandle, pMaskPrimitives.address(), pMaskPrimitives.remaining(), VROverlayIntersectionMaskPrimitive.SIZEOF);
    }

    // --- [ VROverlay_GetOverlayFlags ] ---

    public static int nVROverlay_GetOverlayFlags(long ulOverlayHandle, long pFlags) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayFlags;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, ulOverlayHandle, pFlags);
    }

    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayFlags(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer pFlags) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return nVROverlay_GetOverlayFlags(ulOverlayHandle, memAddress(pFlags));
    }

    // --- [ VROverlay_ShowMessageOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_ShowMessageOverlay ShowMessageOverlay} */
    public static int nVROverlay_ShowMessageOverlay(long pchText, long pchCaption, long pchButton0Text, long pchButton1Text, long pchButton2Text, long pchButton3Text) {
        long __functionAddress = OpenVR.VROverlay.ShowMessageOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(__functionAddress, pchText, pchCaption, pchButton0Text, pchButton1Text, pchButton2Text, pchButton3Text);
    }

    /**
     * Show the message overlay. This will block and return you a result.
     *
     * @param pchText        
     * @param pchCaption     
     * @param pchButton0Text 
     * @param pchButton1Text 
     * @param pchButton2Text 
     * @param pchButton3Text 
     */
    @NativeType("VRMessageOverlayResponse")
    public static int VROverlay_ShowMessageOverlay(@NativeType("const char *") ByteBuffer pchText, @NativeType("const char *") ByteBuffer pchCaption, @NativeType("const char *") ByteBuffer pchButton0Text, @NativeType("const char *") ByteBuffer pchButton1Text, @NativeType("const char *") ByteBuffer pchButton2Text, @NativeType("const char *") ByteBuffer pchButton3Text) {
        if (CHECKS) {
            checkNT1(pchText);
            checkNT1(pchCaption);
            checkNT1(pchButton0Text);
            checkNT1Safe(pchButton1Text);
            checkNT1Safe(pchButton2Text);
            checkNT1Safe(pchButton3Text);
        }
        return nVROverlay_ShowMessageOverlay(memAddress(pchText), memAddress(pchCaption), memAddress(pchButton0Text), memAddressSafe(pchButton1Text), memAddressSafe(pchButton2Text), memAddressSafe(pchButton3Text));
    }

    /**
     * Show the message overlay. This will block and return you a result.
     *
     * @param pchText        
     * @param pchCaption     
     * @param pchButton0Text 
     * @param pchButton1Text 
     * @param pchButton2Text 
     * @param pchButton3Text 
     */
    @NativeType("VRMessageOverlayResponse")
    public static int VROverlay_ShowMessageOverlay(@NativeType("const char *") CharSequence pchText, @NativeType("const char *") CharSequence pchCaption, @NativeType("const char *") CharSequence pchButton0Text, @NativeType("const char *") CharSequence pchButton1Text, @NativeType("const char *") CharSequence pchButton2Text, @NativeType("const char *") CharSequence pchButton3Text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchTextEncoded = stack.ASCII(pchText);
            ByteBuffer pchCaptionEncoded = stack.ASCII(pchCaption);
            ByteBuffer pchButton0TextEncoded = stack.ASCII(pchButton0Text);
            ByteBuffer pchButton1TextEncoded = stack.ASCII(pchButton1Text);
            ByteBuffer pchButton2TextEncoded = stack.ASCII(pchButton2Text);
            ByteBuffer pchButton3TextEncoded = stack.ASCII(pchButton3Text);
            return nVROverlay_ShowMessageOverlay(memAddress(pchTextEncoded), memAddress(pchCaptionEncoded), memAddress(pchButton0TextEncoded), memAddressSafe(pchButton1TextEncoded), memAddressSafe(pchButton2TextEncoded), memAddressSafe(pchButton3TextEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_CloseMessageOverlay ] ---

    /** If the calling process owns the overlay and it's open, this will close it. */
    public static void VROverlay_CloseMessageOverlay() {
        long __functionAddress = OpenVR.VROverlay.CloseMessageOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

}