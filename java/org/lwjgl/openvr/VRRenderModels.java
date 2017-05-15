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

public class VRRenderModels {

    protected VRRenderModels() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRRenderModels_LoadRenderModel_Async ] ---

    /** Unsafe version of: {@link #VRRenderModels_LoadRenderModel_Async LoadRenderModel_Async} */
    public static int nVRRenderModels_LoadRenderModel_Async(long pchRenderModelName, long ppRenderModel) {
        long __functionAddress = OpenVR.VRRenderModels.LoadRenderModel_Async;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, pchRenderModelName, ppRenderModel);
    }

    /**
     * Loads and returns a render model for use in the application. {@code pchRenderModelName} should be a render model name from the
     * {@link VR#ETrackedDeviceProperty_Prop_RenderModelName_String} property or an absolute path name to a render model on disk.
     * 
     * <p>The resulting render model is valid until {@link VR#VR_ShutdownInternal ShutdownInternal} is called or until {@link #VRRenderModels_FreeRenderModel FreeRenderModel} is called. When the application is finished with
     * the render model it should call {@link #VRRenderModels_FreeRenderModel FreeRenderModel} to free the memory associated with the model.</p>
     *
     * @param pchRenderModelName 
     * @param ppRenderModel      
     */
    public static int VRRenderModels_LoadRenderModel_Async(ByteBuffer pchRenderModelName, PointerBuffer ppRenderModel) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            check(ppRenderModel, 1);
        }
        return nVRRenderModels_LoadRenderModel_Async(memAddress(pchRenderModelName), memAddress(ppRenderModel));
    }

    /**
     * Loads and returns a render model for use in the application. {@code pchRenderModelName} should be a render model name from the
     * {@link VR#ETrackedDeviceProperty_Prop_RenderModelName_String} property or an absolute path name to a render model on disk.
     * 
     * <p>The resulting render model is valid until {@link VR#VR_ShutdownInternal ShutdownInternal} is called or until {@link #VRRenderModels_FreeRenderModel FreeRenderModel} is called. When the application is finished with
     * the render model it should call {@link #VRRenderModels_FreeRenderModel FreeRenderModel} to free the memory associated with the model.</p>
     *
     * @param pchRenderModelName 
     * @param ppRenderModel      
     */
    public static int VRRenderModels_LoadRenderModel_Async(CharSequence pchRenderModelName, PointerBuffer ppRenderModel) {
        if (CHECKS) {
            check(ppRenderModel, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            return nVRRenderModels_LoadRenderModel_Async(memAddress(pchRenderModelNameEncoded), memAddress(ppRenderModel));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_FreeRenderModel ] ---

    /** Unsafe version of: {@link #VRRenderModels_FreeRenderModel FreeRenderModel} */
    public static void nVRRenderModels_FreeRenderModel(long pRenderModel) {
        long __functionAddress = OpenVR.VRRenderModels.FreeRenderModel;
        if (CHECKS) {
            check(__functionAddress);
            if (pRenderModel != NULL) { RenderModel.validate(pRenderModel); }
        }
        callPV(__functionAddress, pRenderModel);
    }

    /**
     * Frees a previously returned render model It is safe to call this on a null ptr.
     *
     * @param pRenderModel 
     */
    public static void VRRenderModels_FreeRenderModel(RenderModel pRenderModel) {
        nVRRenderModels_FreeRenderModel(memAddressSafe(pRenderModel));
    }

    // --- [ VRRenderModels_LoadTexture_Async ] ---

    /** Unsafe version of: {@link #VRRenderModels_LoadTexture_Async LoadTexture_Async} */
    public static int nVRRenderModels_LoadTexture_Async(int textureId, long ppTexture) {
        long __functionAddress = OpenVR.VRRenderModels.LoadTexture_Async;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(__functionAddress, textureId, ppTexture);
    }

    /**
     * Loads and returns a texture for use in the application.
     *
     * @param textureId 
     * @param ppTexture 
     */
    public static int VRRenderModels_LoadTexture_Async(int textureId, PointerBuffer ppTexture) {
        if (CHECKS) {
            check(ppTexture, 1);
        }
        return nVRRenderModels_LoadTexture_Async(textureId, memAddress(ppTexture));
    }

    // --- [ VRRenderModels_FreeTexture ] ---

    /** Unsafe version of: {@link #VRRenderModels_FreeTexture FreeTexture} */
    public static void nVRRenderModels_FreeTexture(long pTexture) {
        long __functionAddress = OpenVR.VRRenderModels.FreeTexture;
        if (CHECKS) {
            check(__functionAddress);
            if (pTexture != NULL) { RenderModelTextureMap.validate(pTexture); }
        }
        callPV(__functionAddress, pTexture);
    }

    /**
     * Frees a previously returned texture. It is safe to call this on a null ptr.
     *
     * @param pTexture 
     */
    public static void VRRenderModels_FreeTexture(RenderModelTextureMap pTexture) {
        nVRRenderModels_FreeTexture(memAddressSafe(pTexture));
    }

    // --- [ VRRenderModels_LoadTextureD3D11_Async ] ---

    /** Unsafe version of: {@link #VRRenderModels_LoadTextureD3D11_Async LoadTextureD3D11_Async} */
    public static int nVRRenderModels_LoadTextureD3D11_Async(int textureId, long pD3D11Device, long ppD3D11Texture2D) {
        long __functionAddress = OpenVR.VRRenderModels.LoadTextureD3D11_Async;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11Device);
        }
        return callPPI(__functionAddress, textureId, pD3D11Device, ppD3D11Texture2D);
    }

    /**
     * Creates a D3D11 texture and loads data into it.
     *
     * @param textureId        
     * @param pD3D11Device     
     * @param ppD3D11Texture2D 
     */
    public static int VRRenderModels_LoadTextureD3D11_Async(int textureId, long pD3D11Device, PointerBuffer ppD3D11Texture2D) {
        if (CHECKS) {
            check(ppD3D11Texture2D, 1);
        }
        return nVRRenderModels_LoadTextureD3D11_Async(textureId, pD3D11Device, memAddress(ppD3D11Texture2D));
    }

    // --- [ VRRenderModels_LoadIntoTextureD3D11_Async ] ---

    /**
     * Helper function to copy the bits into an existing texture.
     *
     * @param textureId   
     * @param pDstTexture 
     */
    public static int VRRenderModels_LoadIntoTextureD3D11_Async(int textureId, long pDstTexture) {
        long __functionAddress = OpenVR.VRRenderModels.LoadIntoTextureD3D11_Async;
        if (CHECKS) {
            check(__functionAddress);
            check(pDstTexture);
        }
        return callPI(__functionAddress, textureId, pDstTexture);
    }

    // --- [ VRRenderModels_FreeTextureD3D11 ] ---

    /**
     * Use this to free textures created with LoadTextureD3D11_Async instead of calling Release on them.
     *
     * @param pD3D11Texture2D 
     */
    public static void VRRenderModels_FreeTextureD3D11(long pD3D11Texture2D) {
        long __functionAddress = OpenVR.VRRenderModels.FreeTextureD3D11;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11Texture2D);
        }
        callPV(__functionAddress, pD3D11Texture2D);
    }

    // --- [ VRRenderModels_GetRenderModelName ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetRenderModelName GetRenderModelName} */
    public static int nVRRenderModels_GetRenderModelName(int unRenderModelIndex, long pchRenderModelName, int unRenderModelNameLen) {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(__functionAddress, unRenderModelIndex, pchRenderModelName, unRenderModelNameLen);
    }

    /**
     * Use this to get the names of available render models. Index does not correlate to a tracked device index, but is only used for iterating over all
     * available render models. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
     * name.
     *
     * @param unRenderModelIndex 
     * @param pchRenderModelName 
     */
    public static int VRRenderModels_GetRenderModelName(int unRenderModelIndex, ByteBuffer pchRenderModelName) {
        return nVRRenderModels_GetRenderModelName(unRenderModelIndex, memAddressSafe(pchRenderModelName), remainingSafe(pchRenderModelName));
    }

    /**
     * Use this to get the names of available render models. Index does not correlate to a tracked device index, but is only used for iterating over all
     * available render models. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
     * name.
     *
     * @param unRenderModelIndex   
     * @param unRenderModelNameLen 
     */
    public static String VRRenderModels_GetRenderModelName(int unRenderModelIndex, int unRenderModelNameLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelName = stack.malloc(unRenderModelNameLen);
            int __result = nVRRenderModels_GetRenderModelName(unRenderModelIndex, memAddress(pchRenderModelName), unRenderModelNameLen);
            return memASCII(pchRenderModelName, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetRenderModelCount ] ---

    /** Returns the number of available render models. */
    public static int VRRenderModels_GetRenderModelCount() {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRRenderModels_GetComponentCount ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetComponentCount GetComponentCount} */
    public static int nVRRenderModels_GetComponentCount(long pchRenderModelName) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(__functionAddress, pchRenderModelName);
    }

    /**
     * Returns the number of components of the specified render model.
     * 
     * <p>Components are useful when client application wish to draw, label, or otherwise interact with components of tracked objects.</p>
     *
     * @param pchRenderModelName 
     */
    public static int VRRenderModels_GetComponentCount(ByteBuffer pchRenderModelName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
        }
        return nVRRenderModels_GetComponentCount(memAddress(pchRenderModelName));
    }

    /**
     * Returns the number of components of the specified render model.
     * 
     * <p>Components are useful when client application wish to draw, label, or otherwise interact with components of tracked objects.</p>
     *
     * @param pchRenderModelName 
     */
    public static int VRRenderModels_GetComponentCount(CharSequence pchRenderModelName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            return nVRRenderModels_GetComponentCount(memAddress(pchRenderModelNameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentName ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetComponentName GetComponentName} */
    public static int nVRRenderModels_GetComponentName(long pchRenderModelName, int unComponentIndex, long pchComponentName, int unComponentNameLen) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, pchRenderModelName, unComponentIndex, pchComponentName, unComponentNameLen);
    }

    /**
     * Use this to get the names of available components. Index does not correlate to a tracked device index, but is only used for iterating over all
     * available components. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
     * name.
     *
     * @param pchRenderModelName 
     * @param unComponentIndex   
     * @param pchComponentName   
     */
    public static int VRRenderModels_GetComponentName(ByteBuffer pchRenderModelName, int unComponentIndex, ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
        }
        return nVRRenderModels_GetComponentName(memAddress(pchRenderModelName), unComponentIndex, memAddressSafe(pchComponentName), remainingSafe(pchComponentName));
    }

    /**
     * Use this to get the names of available components. Index does not correlate to a tracked device index, but is only used for iterating over all
     * available components. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
     * name.
     *
     * @param pchRenderModelName 
     * @param unComponentIndex   
     * @param pchComponentName   
     */
    public static int VRRenderModels_GetComponentName(CharSequence pchRenderModelName, int unComponentIndex, ByteBuffer pchComponentName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            return nVRRenderModels_GetComponentName(memAddress(pchRenderModelNameEncoded), unComponentIndex, memAddressSafe(pchComponentName), remainingSafe(pchComponentName));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Use this to get the names of available components. Index does not correlate to a tracked device index, but is only used for iterating over all
     * available components. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
     * name.
     *
     * @param pchRenderModelName 
     * @param unComponentIndex   
     * @param unComponentNameLen 
     */
    public static String VRRenderModels_GetComponentName(CharSequence pchRenderModelName, int unComponentIndex, int unComponentNameLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            ByteBuffer pchComponentName = stack.malloc(unComponentNameLen);
            int __result = nVRRenderModels_GetComponentName(memAddress(pchRenderModelNameEncoded), unComponentIndex, memAddress(pchComponentName), unComponentNameLen);
            return memASCII(pchComponentName, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentButtonMask ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetComponentButtonMask GetComponentButtonMask} */
    public static long nVRRenderModels_GetComponentButtonMask(long pchRenderModelName, long pchComponentName) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentButtonMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(__functionAddress, pchRenderModelName, pchComponentName);
    }

    /**
     * Get the button mask for all buttons associated with this component.
     * 
     * <p>If no buttons (or axes) are associated with this component, return 0</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>multiple components may be associated with the same button. Ex: two grip buttons on a single controller.</p></div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>A single component may be associated with multiple buttons. Ex: A trackpad which also provides "D-pad" functionality</p></div>
     *
     * @param pchRenderModelName 
     * @param pchComponentName   
     */
    public static long VRRenderModels_GetComponentButtonMask(ByteBuffer pchRenderModelName, ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_GetComponentButtonMask(memAddress(pchRenderModelName), memAddress(pchComponentName));
    }

    /**
     * Get the button mask for all buttons associated with this component.
     * 
     * <p>If no buttons (or axes) are associated with this component, return 0</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>multiple components may be associated with the same button. Ex: two grip buttons on a single controller.</p></div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>A single component may be associated with multiple buttons. Ex: A trackpad which also provides "D-pad" functionality</p></div>
     *
     * @param pchRenderModelName 
     * @param pchComponentName   
     */
    public static long VRRenderModels_GetComponentButtonMask(CharSequence pchRenderModelName, CharSequence pchComponentName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            ByteBuffer pchComponentNameEncoded = stack.ASCII(pchComponentName);
            return nVRRenderModels_GetComponentButtonMask(memAddress(pchRenderModelNameEncoded), memAddress(pchComponentNameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentRenderModelName ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetComponentRenderModelName GetComponentRenderModelName} */
    public static int nVRRenderModels_GetComponentRenderModelName(long pchRenderModelName, long pchComponentName, long pchComponentRenderModelName, int unComponentRenderModelNameLen) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentRenderModelName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, pchRenderModelName, pchComponentName, pchComponentRenderModelName, unComponentRenderModelNameLen);
    }

    /**
     * Use this to get the render model name for the specified rendermode/component combination, to be passed to {@link #VRRenderModels_LoadRenderModel_Async LoadRenderModel_Async}. If the component
     * name is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the name.
     *
     * @param pchRenderModelName          
     * @param pchComponentName            
     * @param pchComponentRenderModelName 
     */
    public static int VRRenderModels_GetComponentRenderModelName(ByteBuffer pchRenderModelName, ByteBuffer pchComponentName, ByteBuffer pchComponentRenderModelName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_GetComponentRenderModelName(memAddress(pchRenderModelName), memAddress(pchComponentName), memAddressSafe(pchComponentRenderModelName), remainingSafe(pchComponentRenderModelName));
    }

    /**
     * Use this to get the render model name for the specified rendermode/component combination, to be passed to {@link #VRRenderModels_LoadRenderModel_Async LoadRenderModel_Async}. If the component
     * name is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the name.
     *
     * @param pchRenderModelName          
     * @param pchComponentName            
     * @param pchComponentRenderModelName 
     */
    public static int VRRenderModels_GetComponentRenderModelName(CharSequence pchRenderModelName, CharSequence pchComponentName, ByteBuffer pchComponentRenderModelName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            ByteBuffer pchComponentNameEncoded = stack.ASCII(pchComponentName);
            return nVRRenderModels_GetComponentRenderModelName(memAddress(pchRenderModelNameEncoded), memAddress(pchComponentNameEncoded), memAddressSafe(pchComponentRenderModelName), remainingSafe(pchComponentRenderModelName));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Use this to get the render model name for the specified rendermode/component combination, to be passed to {@link #VRRenderModels_LoadRenderModel_Async LoadRenderModel_Async}. If the component
     * name is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the name.
     *
     * @param pchRenderModelName            
     * @param pchComponentName              
     * @param unComponentRenderModelNameLen 
     */
    public static String VRRenderModels_GetComponentRenderModelName(CharSequence pchRenderModelName, CharSequence pchComponentName, int unComponentRenderModelNameLen) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            ByteBuffer pchComponentNameEncoded = stack.ASCII(pchComponentName);
            ByteBuffer pchComponentRenderModelName = stack.malloc(unComponentRenderModelNameLen);
            int __result = nVRRenderModels_GetComponentRenderModelName(memAddress(pchRenderModelNameEncoded), memAddress(pchComponentNameEncoded), memAddress(pchComponentRenderModelName), unComponentRenderModelNameLen);
            return memASCII(pchComponentRenderModelName, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetComponentState ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetComponentState GetComponentState} */
    public static boolean nVRRenderModels_GetComponentState(long pchRenderModelName, long pchComponentName, long pControllerState, long pState, long pComponentState) {
        long __functionAddress = OpenVR.VRRenderModels.GetComponentState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPZ(__functionAddress, pchRenderModelName, pchComponentName, pControllerState, pState, pComponentState);
    }

    /**
     * Use this to query information about the component, as a function of the controller state.
     * 
     * <p>For dynamic controller components (ex: trigger) values will reflect component motions. For static components this will return a consistent value
     * independent of the {@link VRControllerState}.</p>
     * 
     * <p>If the {@code pchRenderModelName} or {@code pchComponentName} is invalid, this will return false (and transforms will be set to identity). Otherwise,
     * return true.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For dynamic objects, visibility may be dynamic. (I.e., true/false will be returned based on controller state and controller mode state )</p></div>
     *
     * @param pchRenderModelName 
     * @param pchComponentName   
     * @param pControllerState   
     * @param pState             
     * @param pComponentState    
     */
    public static boolean VRRenderModels_GetComponentState(ByteBuffer pchRenderModelName, ByteBuffer pchComponentName, VRControllerState pControllerState, RenderModelControllerModeState pState, RenderModelComponentState pComponentState) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_GetComponentState(memAddress(pchRenderModelName), memAddress(pchComponentName), pControllerState.address(), pState.address(), pComponentState.address());
    }

    /**
     * Use this to query information about the component, as a function of the controller state.
     * 
     * <p>For dynamic controller components (ex: trigger) values will reflect component motions. For static components this will return a consistent value
     * independent of the {@link VRControllerState}.</p>
     * 
     * <p>If the {@code pchRenderModelName} or {@code pchComponentName} is invalid, this will return false (and transforms will be set to identity). Otherwise,
     * return true.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For dynamic objects, visibility may be dynamic. (I.e., true/false will be returned based on controller state and controller mode state )</p></div>
     *
     * @param pchRenderModelName 
     * @param pchComponentName   
     * @param pControllerState   
     * @param pState             
     * @param pComponentState    
     */
    public static boolean VRRenderModels_GetComponentState(CharSequence pchRenderModelName, CharSequence pchComponentName, VRControllerState pControllerState, RenderModelControllerModeState pState, RenderModelComponentState pComponentState) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            ByteBuffer pchComponentNameEncoded = stack.ASCII(pchComponentName);
            return nVRRenderModels_GetComponentState(memAddress(pchRenderModelNameEncoded), memAddress(pchComponentNameEncoded), pControllerState.address(), pState.address(), pComponentState.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_RenderModelHasComponent ] ---

    /** Unsafe version of: {@link #VRRenderModels_RenderModelHasComponent RenderModelHasComponent} */
    public static boolean nVRRenderModels_RenderModelHasComponent(long pchRenderModelName, long pchComponentName) {
        long __functionAddress = OpenVR.VRRenderModels.RenderModelHasComponent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(__functionAddress, pchRenderModelName, pchComponentName);
    }

    /**
     * Returns true if the render model has a component with the specified name.
     *
     * @param pchRenderModelName 
     * @param pchComponentName   
     */
    public static boolean VRRenderModels_RenderModelHasComponent(ByteBuffer pchRenderModelName, ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
        }
        return nVRRenderModels_RenderModelHasComponent(memAddress(pchRenderModelName), memAddress(pchComponentName));
    }

    /**
     * Returns true if the render model has a component with the specified name.
     *
     * @param pchRenderModelName 
     * @param pchComponentName   
     */
    public static boolean VRRenderModels_RenderModelHasComponent(CharSequence pchRenderModelName, CharSequence pchComponentName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            ByteBuffer pchComponentNameEncoded = stack.ASCII(pchComponentName);
            return nVRRenderModels_RenderModelHasComponent(memAddress(pchRenderModelNameEncoded), memAddress(pchComponentNameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetRenderModelThumbnailURL ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetRenderModelThumbnailURL GetRenderModelThumbnailURL} */
    public static int nVRRenderModels_GetRenderModelThumbnailURL(long pchRenderModelName, long pchThumbnailURL, int unThumbnailURLLen, long peError) {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelThumbnailURL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, pchRenderModelName, pchThumbnailURL, unThumbnailURLLen, peError);
    }

    /**
     * Returns the URL of the thumbnail image for this rendermodel.
     *
     * @param pchRenderModelName 
     * @param pchThumbnailURL    
     * @param peError            
     */
    public static int VRRenderModels_GetRenderModelThumbnailURL(ByteBuffer pchRenderModelName, ByteBuffer pchThumbnailURL, IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            check(peError, 1);
        }
        return nVRRenderModels_GetRenderModelThumbnailURL(memAddress(pchRenderModelName), memAddressSafe(pchThumbnailURL), remainingSafe(pchThumbnailURL), memAddress(peError));
    }

    /**
     * Returns the URL of the thumbnail image for this rendermodel.
     *
     * @param pchRenderModelName 
     * @param pchThumbnailURL    
     * @param peError            
     */
    public static int VRRenderModels_GetRenderModelThumbnailURL(CharSequence pchRenderModelName, ByteBuffer pchThumbnailURL, IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            return nVRRenderModels_GetRenderModelThumbnailURL(memAddress(pchRenderModelNameEncoded), memAddressSafe(pchThumbnailURL), remainingSafe(pchThumbnailURL), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the URL of the thumbnail image for this rendermodel.
     *
     * @param pchRenderModelName 
     * @param unThumbnailURLLen  
     * @param peError            
     */
    public static String VRRenderModels_GetRenderModelThumbnailURL(CharSequence pchRenderModelName, int unThumbnailURLLen, IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            ByteBuffer pchThumbnailURL = stack.malloc(unThumbnailURLLen);
            int __result = nVRRenderModels_GetRenderModelThumbnailURL(memAddress(pchRenderModelNameEncoded), memAddress(pchThumbnailURL), unThumbnailURLLen, memAddress(peError));
            return memASCII(pchThumbnailURL, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetRenderModelOriginalPath ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetRenderModelOriginalPath GetRenderModelOriginalPath} */
    public static int nVRRenderModels_GetRenderModelOriginalPath(long pchRenderModelName, long pchOriginalPath, int unOriginalPathLen, long peError) {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelOriginalPath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, pchRenderModelName, pchOriginalPath, unOriginalPathLen, peError);
    }

    /**
     * Provides a render model path that will load the unskinned model if the model name provided has been replace by the user. If the model hasn't been
     * replaced the path value will still be a valid path to load the model. Pass this to LoadRenderModel_Async, etc. to load the model.
     *
     * @param pchRenderModelName 
     * @param pchOriginalPath    
     * @param peError            
     */
    public static int VRRenderModels_GetRenderModelOriginalPath(ByteBuffer pchRenderModelName, ByteBuffer pchOriginalPath, IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            check(peError, 1);
        }
        return nVRRenderModels_GetRenderModelOriginalPath(memAddress(pchRenderModelName), memAddressSafe(pchOriginalPath), remainingSafe(pchOriginalPath), memAddress(peError));
    }

    /**
     * Provides a render model path that will load the unskinned model if the model name provided has been replace by the user. If the model hasn't been
     * replaced the path value will still be a valid path to load the model. Pass this to LoadRenderModel_Async, etc. to load the model.
     *
     * @param pchRenderModelName 
     * @param pchOriginalPath    
     * @param peError            
     */
    public static int VRRenderModels_GetRenderModelOriginalPath(CharSequence pchRenderModelName, ByteBuffer pchOriginalPath, IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            return nVRRenderModels_GetRenderModelOriginalPath(memAddress(pchRenderModelNameEncoded), memAddressSafe(pchOriginalPath), remainingSafe(pchOriginalPath), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Provides a render model path that will load the unskinned model if the model name provided has been replace by the user. If the model hasn't been
     * replaced the path value will still be a valid path to load the model. Pass this to LoadRenderModel_Async, etc. to load the model.
     *
     * @param pchRenderModelName 
     * @param unOriginalPathLen  
     * @param peError            
     */
    public static String VRRenderModels_GetRenderModelOriginalPath(CharSequence pchRenderModelName, int unOriginalPathLen, IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchRenderModelNameEncoded = stack.ASCII(pchRenderModelName);
            ByteBuffer pchOriginalPath = stack.malloc(unOriginalPathLen);
            int __result = nVRRenderModels_GetRenderModelOriginalPath(memAddress(pchRenderModelNameEncoded), memAddress(pchOriginalPath), unOriginalPathLen, memAddress(peError));
            return memASCII(pchOriginalPath, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRRenderModels_GetRenderModelErrorNameFromEnum ] ---

    /** Unsafe version of: {@link #VRRenderModels_GetRenderModelErrorNameFromEnum GetRenderModelErrorNameFromEnum} */
    public static long nVRRenderModels_GetRenderModelErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VRRenderModels.GetRenderModelErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress, error);
    }

    /**
     * Returns a string for a render model error.
     *
     * @param error 
     */
    public static String VRRenderModels_GetRenderModelErrorNameFromEnum(int error) {
        long __result = nVRRenderModels_GetRenderModelErrorNameFromEnum(error);
        return memASCII(__result);
    }

}