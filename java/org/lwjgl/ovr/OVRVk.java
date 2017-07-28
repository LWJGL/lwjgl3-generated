/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

/**
 * Native bindings to libOVR, using the <a target="_blank" href="https://developer.oculus.com/">Oculus SDK</a> C API.
 * 
 * <p>This class contains Vulkan specific functionality.</p>
 */
public class OVRVk {

    static { LibOVR.initialize(); }

    protected OVRVk() {
        throw new UnsupportedOperationException();
    }

    // --- [ ovr_GetSessionPhysicalDeviceVk ] ---

    /** Unsafe version of: {@link #ovr_GetSessionPhysicalDeviceVk GetSessionPhysicalDeviceVk} */
    public static native int novr_GetSessionPhysicalDeviceVk(long session, long luid, long instance, long out_physicalDevice);

    /**
     * Finds {@code VkPhysicalDevice} matching {@code ovrGraphicsLuid}.
     * 
     * <code>This function enumerates the current physical devices and returns the one matching the {@code luid}. It must be called at least once prior to any
     * {@link #ovr_CreateTextureSwapChainVk CreateTextureSwapChainVk} or {@link #ovr_CreateMirrorTextureWithOptionsVk CreateMirrorTextureWithOptionsVk} calls, and the instance must remain valid for the lifetime of the returned
     * objects. It is assumed the {@code VkDevice} created by the application will be for the returned physical device.
     * </code>
     *
     * @param session            an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
     * @param luid               the {@code luid} returned from {@link OVR#ovr_Create Create}
     * @param instance           a {@code VkInstance} to search for matching {@code luids} in
     * @param out_physicalDevice returns the {@code VkPhysicalDevice} matching the instance and {@code luid}
     *
     * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
     */
    @NativeType("ovrResult")
    public static int ovr_GetSessionPhysicalDeviceVk(@NativeType("ovrSession") long session, @NativeType("ovrGraphicsLuid") OVRGraphicsLuid luid, VkInstance instance, @NativeType("VkPhysicalDevice *") PointerBuffer out_physicalDevice) {
        if (CHECKS) {
            check(session);
            check(out_physicalDevice, 1);
        }
        return novr_GetSessionPhysicalDeviceVk(session, luid.address(), instance.address(), memAddress(out_physicalDevice));
    }

    // --- [ ovr_SetSynchonizationQueueVk ] ---

    /** Unsafe version of: {@link #ovr_SetSynchonizationQueueVk SetSynchonizationQueueVk} */
    public static native int novr_SetSynchonizationQueueVk(long session, long queue);

    /**
     * Selects {@code VkQueue} to block on till rendering is complete.
     * 
     * <code>The queue may be changed at any time but only the value at the time {@link OVR#ovr_SubmitFrame SubmitFrame} is called will be used. {@code ovr_SetSynchonizationQueueVk}
     * must be called with a valid {@code VkQueue} created on the same {@code VkDevice} the texture sets were created on prior to the first call to
     * {@link OVR#ovr_SubmitFrame SubmitFrame}. An internally created {@code VkFence} object will be signalled by the completion of operations on queue and waited on to
     * synchronize the VR compositor.
     * </code>
     *
     * @param session an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
     * @param queue   a {@code VkQueue} to add a {@code VkFence} operation to and wait on
     *
     * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
     */
    @NativeType("ovrResult")
    public static int ovr_SetSynchonizationQueueVk(@NativeType("ovrSession") long session, VkQueue queue) {
        if (CHECKS) {
            check(session);
        }
        return novr_SetSynchonizationQueueVk(session, queue.address());
    }

    // --- [ ovr_CreateTextureSwapChainVk ] ---

    /** Unsafe version of: {@link #ovr_CreateTextureSwapChainVk CreateTextureSwapChainVk} */
    public static native int novr_CreateTextureSwapChainVk(long session, long device, long desc, long out_TextureSwapChain);

    /**
     * Creates Texture Swap Chain suitable for use with Vulkan.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The texture format provided in {@code desc} should be thought of as the format the distortion-compositor will use for the
     * {@code ShaderResourceView} when reading the contents of the texture. To that end, it is highly recommended that the application requests texture
     * swapchain formats that are in sRGB-space (e.g. {@link OVR#OVR_FORMAT_R8G8B8A8_UNORM_SRGB}) as the compositor does sRGB-correct rendering. As such, the
     * compositor relies on the GPU's hardware sampler to do the sRGB-to-linear conversion. If the application still prefers to render to a linear format
     * (e.g. {@link OVR#OVR_FORMAT_R8G8B8A8_UNORM}) while handling the linear-to-gamma conversion via SPIRV code, then the application must still request the
     * corresponding sRGB format and also use the {@link OVR#ovrTextureMisc_DX_Typeless TextureMisc_DX_Typeless} flag in the {@code ovrTextureSwapChainDesc}'s {@code Flag} field. This will
     * allow the application to create a {@code RenderTargetView} that is the desired linear format while the compositor continues to treat it as sRGB.
     * Failure to do so will cause the compositor to apply unexpected gamma conversions leading to gamma-curve artifacts. The {@link OVR#ovrTextureMisc_DX_Typeless TextureMisc_DX_Typeless}
     * flag for depth buffer formats (e.g. {@link OVR#OVR_FORMAT_D32_FLOAT}) is ignored as they are always converted to be typeless.</p>
     * </div>
     *
     * @param session              an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
     * @param device               the application's {@code VkDevice} to create resources with
     * @param desc                 specifies requested texture properties. See notes for more info about texture format.
     * @param out_TextureSwapChain returns the created {@code ovrTextureSwapChain}, which will be valid upon a successful return value, else it will be {@code NULL}. This texture chain must
     *                             be eventually destroyed via {@link OVR#ovr_DestroyTextureSwapChain DestroyTextureSwapChain} before destroying the session with {@link OVR#ovr_Destroy Destroy}.
     *
     * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
     */
    @NativeType("ovrResult")
    public static int ovr_CreateTextureSwapChainVk(@NativeType("ovrSession") long session, VkDevice device, @NativeType("const ovrTextureSwapChainDesc *") OVRTextureSwapChainDesc desc, @NativeType("ovrTextureSwapChain *") PointerBuffer out_TextureSwapChain) {
        if (CHECKS) {
            check(session);
            check(out_TextureSwapChain, 1);
        }
        return novr_CreateTextureSwapChainVk(session, device.address(), desc.address(), memAddress(out_TextureSwapChain));
    }

    // --- [ ovr_GetTextureSwapChainBufferVk ] ---

    /** Unsafe version of: {@link #ovr_GetTextureSwapChainBufferVk GetTextureSwapChainBufferVk} */
    public static native int novr_GetTextureSwapChainBufferVk(long session, long chain, int index, long out_Image);

    /**
     * Gets a specific {@code VkImage} within the chain.
     *
     * @param session   an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
     * @param chain     an {@code ovrTextureSwapChain} previously returned by {@link #ovr_CreateTextureSwapChainVk CreateTextureSwapChainVk}
     * @param index     the index within the chain to retrieve. Must be between 0 and length (see {@link OVR#ovr_GetTextureSwapChainLength GetTextureSwapChainLength}), or may pass -1 to get the buffer at the
     *                  {@code CurrentIndex} location (saving a call to {@link OVR#ovr_GetTextureSwapChainCurrentIndex GetTextureSwapChainCurrentIndex}).
     * @param out_Image 
     *
     * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
     */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainBufferVk(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, int index, @NativeType("VkImage *") LongBuffer out_Image) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Image, 1);
        }
        return novr_GetTextureSwapChainBufferVk(session, chain, index, memAddress(out_Image));
    }

    // --- [ ovr_CreateMirrorTextureWithOptionsVk ] ---

    /** Unsafe version of: {@link #ovr_CreateMirrorTextureWithOptionsVk CreateMirrorTextureWithOptionsVk} */
    public static native int novr_CreateMirrorTextureWithOptionsVk(long session, long device, long desc, long out_MirrorTexture);

    /**
     * Creates Mirror Texture which is auto-refreshed to mirror Rift contents produced by this application.
     * 
     * <p>A second call to {@code ovr_CreateMirrorTextureWithOptionsVk} for a given {@code ovrSession} before destroying the first one is not supported and will
     * result in an error return.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The texture format provided in {@code desc} should be thought of as the format the compositor will use for the {@code VkImageView} when writing
     * into mirror texture. To that end, it is highly recommended that the application requests a mirror texture format that is in sRGB-space (e.g.
     * {@link OVR#OVR_FORMAT_R8G8B8A8_UNORM_SRGB}) as the compositor does sRGB-correct rendering. If however the application wants to still read the mirror texture
     * as a linear format (e.g. {@link OVR#OVR_FORMAT_R8G8B8A8_UNORM}) and handle the sRGB-to-linear conversion in SPIRV code, then it is recommended the application
     * still requests an sRGB format and also use the {@link OVR#ovrTextureMisc_DX_Typeless TextureMisc_DX_Typeless} flag in the {@code ovrMirrorTextureDesc}'s {@code Flags} field. This will
     * allow the application to bind a {@code ShaderResourceView} that is a linear format while the compositor continues to treat is as sRGB. Failure to
     * do so will cause the compositor to apply unexpected gamma conversions leading to gamma-curve artifacts.</p>
     * </div>
     *
     * @param session           an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
     * @param device            the {@code VkDevice} to create resources with
     * @param desc              specifies requested texture properties. See notes for more info about texture format.
     * @param out_MirrorTexture returns the created {@code ovrMirrorTexture}, which will be valid upon a successful return value, else it will be {@code NULL}. This texture must be
     *                          eventually destroyed via {@link OVR#ovr_DestroyMirrorTexture DestroyMirrorTexture} before destroying the session with {@link OVR#ovr_Destroy Destroy}.
     *
     * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
     */
    @NativeType("ovrResult")
    public static int ovr_CreateMirrorTextureWithOptionsVk(@NativeType("ovrSession") long session, VkDevice device, @NativeType("const ovrMirrorTextureDesc *") OVRMirrorTextureDesc desc, @NativeType("ovrMirrorTexture *") PointerBuffer out_MirrorTexture) {
        if (CHECKS) {
            check(session);
            check(out_MirrorTexture, 1);
        }
        return novr_CreateMirrorTextureWithOptionsVk(session, device.address(), desc.address(), memAddress(out_MirrorTexture));
    }

    // --- [ ovr_GetMirrorTextureBufferVk ] ---

    /** Unsafe version of: {@link #ovr_GetMirrorTextureBufferVk GetMirrorTextureBufferVk} */
    public static native int novr_GetMirrorTextureBufferVk(long session, long mirrorTexture, long out_Image);

    /**
     * Gets the underlying mirror {@code VkImage}.
     *
     * @param session       an {@code ovrSession} previously returned by {@link OVR#ovr_Create Create}
     * @param mirrorTexture an {@code ovrMirrorTexture} previously returned by {@link #ovr_CreateMirrorTextureWithOptionsVk CreateMirrorTextureWithOptionsVk}
     * @param out_Image     returns the {@code VkImage} pointer retrieved
     *
     * @return an {@code ovrResult} indicating success or failure. In the case of failure, use {@link OVR#ovr_GetLastErrorInfo GetLastErrorInfo} to get more information.
     */
    @NativeType("ovrResult")
    public static int ovr_GetMirrorTextureBufferVk(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTexture") long mirrorTexture, @NativeType("VkImage *") LongBuffer out_Image) {
        if (CHECKS) {
            check(session);
            check(mirrorTexture);
            check(out_Image, 1);
        }
        return novr_GetMirrorTextureBufferVk(session, mirrorTexture, memAddress(out_Image));
    }

    /** Array version of: {@link #novr_GetTextureSwapChainBufferVk} */
    public static native int novr_GetTextureSwapChainBufferVk(long session, long chain, int index, long[] out_Image);

    /** Array version of: {@link #ovr_GetTextureSwapChainBufferVk GetTextureSwapChainBufferVk} */
    @NativeType("ovrResult")
    public static int ovr_GetTextureSwapChainBufferVk(@NativeType("ovrSession") long session, @NativeType("ovrTextureSwapChain") long chain, int index, @NativeType("VkImage *") long[] out_Image) {
        if (CHECKS) {
            check(session);
            check(chain);
            check(out_Image, 1);
        }
        return novr_GetTextureSwapChainBufferVk(session, chain, index, out_Image);
    }

    /** Array version of: {@link #novr_GetMirrorTextureBufferVk} */
    public static native int novr_GetMirrorTextureBufferVk(long session, long mirrorTexture, long[] out_Image);

    /** Array version of: {@link #ovr_GetMirrorTextureBufferVk GetMirrorTextureBufferVk} */
    @NativeType("ovrResult")
    public static int ovr_GetMirrorTextureBufferVk(@NativeType("ovrSession") long session, @NativeType("ovrMirrorTexture") long mirrorTexture, @NativeType("VkImage *") long[] out_Image) {
        if (CHECKS) {
            check(session);
            check(mirrorTexture);
            check(out_Image, 1);
        }
        return novr_GetMirrorTextureBufferVk(session, mirrorTexture, out_Image);
    }

}