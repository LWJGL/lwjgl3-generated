/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSwapchainCreateInfoKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSwapchainCreateInfoKHR">Vulkan Specification</a>
 * 
 * <p>Contains information about how a swapchain should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
 * <li>{@code imageFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code imageColorSpace} <b>must</b> be a valid {@code VkColorSpaceKHR} value</li>
 * <li>{@code imageUsage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code imageUsage} <b>must not</b> be 0</li>
 * <li>{@code imageSharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
 * <li>{@code preTransform} <b>must</b> be a valid {@code VkSurfaceTransformFlagBitsKHR} value</li>
 * <li>{@code compositeAlpha} <b>must</b> be a valid {@code VkCompositeAlphaFlagBitsKHR} value</li>
 * <li>{@code presentMode} <b>must</b> be a valid {@code VkPresentModeKHR} value</li>
 * <li>If {@code oldSwapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code oldSwapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * <li>If {@code oldSwapchain} is a valid handle, it <b>must</b> have been created, allocated or retrieved from {@code surface}</li>
 * <li>Each of {@code surface} and {@code oldSwapchain} that are valid handles <b>must</b> have been created, allocated or retrieved from the same
 * {@code VkInstance}</li>
 * <li>{@code surface} <b>must</b> be a surface that is supported by the device as determined using {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR}</li>
 * <li>The native window referred to by {@code surface} <b>must not</b> already be associated with a swapchain other than {@code oldSwapchain}, or with a
 * non-Vulkan graphics API surface</li>
 * <li>{@code minImageCount} <b>must</b> be greater than or equal to the value returned in the {@code minImageCount} member of the {@link VkSurfaceCapabilitiesKHR}
 * structure returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>{@code minImageCount} <b>must</b> be less than or equal to the value returned in the {@code maxImageCount} member of the {@link VkSurfaceCapabilitiesKHR}
 * structure returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface if the returned {@code maxImageCount} is not zero</li>
 * <li>{@code imageFormat} and {@code imageColorspace} <b>must</b> match the {@code format} and {@code colorSpace} members, respectively, of one of the
 * {@link VkSurfaceFormatKHR} structures returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR} for the surface</li>
 * <li>{@code imageExtent} <b>must</b> be between {@code minImageExtent} and {@code maxImageExtent}, inclusive, where {@code minImageExtent} and
 * {@code maxImageExtent} are members of the {@link VkSurfaceCapabilitiesKHR} structure returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for the
 * surface</li>
 * <li>{@code imageArrayLayers} <b>must</b> be greater than 0 and less than or equal to the {@code maxImageArrayLayers} member of the {@link VkSurfaceCapabilitiesKHR}
 * structure returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>{@code imageUsage} <b>must</b> be a subset of the supported usage flags present in the {@code supportedUsageFlags} member of the
 * {@link VkSurfaceCapabilitiesKHR} structure returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>If {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code pQueueFamilyIndices} <b>must</b> be a pointer to an array of
 * {@code queueFamilyIndexCount} {@code uint32_t} values</li>
 * <li>If {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
 * <li>{@code preTransform} <b>must</b> be one of the bits present in the {@code supportedTransforms} member of the {@link VkSurfaceCapabilitiesKHR} structure
 * returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>{@code compositeAlpha} <b>must</b> be one of the bits present in the {@code supportedCompositeAlpha} member of the {@link VkSurfaceCapabilitiesKHR} structure
 * returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>{@code presentMode} <b>must</b> be one of the ename:VkPresentModeKHR values returned by {@link KHRSurface#vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR} for the surface</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link KHRSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use, and <b>must</b> be zero</li>
 * <li>{@code surface} &ndash; the surface that the swapchain will present images to</li>
 * <li>{@code minImageCount} &ndash; 
 * the minimum number of presentable images that the application needs. The platform will either create the swapchain with at least that many images, or
 * will fail to create the swapchain.</li>
 * <li>{@code imageFormat} &ndash; a {@code VkFormat} that is valid for swapchains on the specified surface</li>
 * <li>{@code imageColorSpace} &ndash; a {@code VkColorSpaceKHR} that is valid for swapchains on the specified surface. Must be:<br><table><tr><td>{@link KHRSurface#VK_COLOR_SPACE_SRGB_NONLINEAR_KHR COLOR_SPACE_SRGB_NONLINEAR_KHR}</td></tr></table></li>
 * <li>{@code imageExtent} &ndash; 
 * the size (in pixels) of the swapchain. Behavior is platform-dependent when the image extent does not match the surface’s {@code currentExtent} as
 * returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}.</li>
 * <li>{@code imageArrayLayers} &ndash; the number of views in a multiview/stereo surface. For non-stereoscopic-3D applications, this value is 1</li>
 * <li>{@code imageUsage} &ndash; a bitfield of {@code VkImageUsageFlagBits}, indicating how the application will use the swapchain’s presentable images. One or more of:<br><table><tr><td>{@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</td><td>{@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</td><td>{@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}</td><td>{@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</td></tr><tr><td>{@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</td><td>{@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}</td></tr></table></li>
 * <li>{@code imageSharingMode} &ndash; the sharing mode used for the images of the swapchain. One of:<br><table><tr><td>{@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}</td><td>{@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}</td></tr></table></li>
 * <li>{@code queueFamilyIndexCount} &ndash; the number of queue families having access to the images of the swapchain in case {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}</li>
 * <li>{@code pQueueFamilyIndices} &ndash; an array of queue family indices having access to the images of the swapchain in case {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}</li>
 * <li>{@code preTransform} &ndash; a bitfield of {@code VkSurfaceTransformFlagBitsKHR}, describing the transform, relative to the presentation engine’s natural orientation, applied to
 * the image content prior to presentation. If it does not match the {@code currentTransform} value returned by
 * {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}, the presentation engine will transform the image content as part of the presentation operation. One of:<br><table><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR SURFACE_TRANSFORM_INHERIT_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_ROTATE_180_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR}</td></tr></table></li>
 * <li>{@code compositeAlpha} &ndash; a bitfield of {@code VkCompositeAlphaFlagBitsKHR}, indicating the alpha compositing mode to use when this surface is composited together with other
 * surfaces on certain window systems. One of:<br><table><tr><td>{@link KHRSurface#VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR COMPOSITE_ALPHA_INHERIT_BIT_KHR}</td><td>{@link KHRSurface#VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR COMPOSITE_ALPHA_OPAQUE_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR}</td><td>{@link KHRSurface#VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR}</td></tr></table></li>
 * <li>{@code presentMode} &ndash; the presentation mode the swapchain will use. A swapchain’s present mode determines how incoming present requests will be processed and queued
 * internally. One of:<br><table><tr><td>{@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR}</td><td>{@link KHRSurface#VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR}</td><td>{@link KHRSurface#VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR}</td></tr><tr><td>{@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}</td></tr></table></li>
 * <li>{@code clipped} &ndash; 
 * indicates whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface which aren’t visible.
 * 
 * <p>If set to {@link VK10#VK_TRUE TRUE}, the presentable images associated with the swapchain may not own all of their pixels. Pixels in the presentable images that correspond
 * to regions of the target surface obscured by another window on the desktop or subject to some other clipping mechanism will have undefined content when
 * read back. Pixel shaders may not execute for these pixels, and thus any side affects they would have had will not occur.</p>
 * 
 * <p>If set to {@link VK10#VK_FALSE FALSE}, presentable images associated with the swapchain will own all the pixels they contain.</p>
 * 
 * <p>Setting this value to {@link VK10#VK_TRUE TRUE} does not guarantee any clipping will occur, but allows more optimal presentation methods to be used on some platforms.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Applications should set this value to {@link VK10#VK_TRUE TRUE} if they do not expect to read back the content of presentable images before presenting them or after
 * reacquiring them and if their pixel shaders do not have any side effects that require them to run for all pixels in the presentable image.</p>
 * </div></li>
 * <li>{@code oldSwapchain} &ndash; 
 * if non-{@code NULL}, specifies the swapchain that will be replaced by the new swapchain being created. Upon calling {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR} with a non-{@code NULL}
 * {@code oldSwapchain}, any images not acquired by the application may be freed by the implementation, which may occur even if creation of the new
 * swapchain fails. The application must destroy the old swapchain to free all memory associated with the old swapchain. The application must wait for the
 * completion of any outstanding rendering to images it currently has acquired at the time the swapchain is destroyed. The application can continue to
 * present any images it acquired and has not yet presented using the old swapchain, as long as it has not entered a state that causes it to return
 * {@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}. However, the application cannot acquire any more images from the old swapchain regardless of whether or not creation of the new
 * swapchain succeeds.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSwapchainCreateInfoKHR {
    VkStructureType sType;
    const void * pNext;
    VkSwapchainCreateFlagsKHR flags;
    VkSurfaceKHR surface;
    uint32_t minImageCount;
    VkFormat imageFormat;
    VkColorSpaceKHR imageColorSpace;
    {@link VkExtent2D VkExtent2D} imageExtent;
    uint32_t imageArrayLayers;
    VkImageUsageFlags imageUsage;
    VkSharingMode imageSharingMode;
    uint32_t queueFamilyIndexCount;
    const uint32_t * pQueueFamilyIndices;
    VkSurfaceTransformFlagBitsKHR preTransform;
    VkCompositeAlphaFlagBitsKHR compositeAlpha;
    VkPresentModeKHR presentMode;
    VkBool32 clipped;
    VkSwapchainKHR oldSwapchain;
}</code></pre>
 */
public class VkSwapchainCreateInfoKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		SURFACE,
		MINIMAGECOUNT,
		IMAGEFORMAT,
		IMAGECOLORSPACE,
		IMAGEEXTENT,
		IMAGEARRAYLAYERS,
		IMAGEUSAGE,
		IMAGESHARINGMODE,
		QUEUEFAMILYINDEXCOUNT,
		PQUEUEFAMILYINDICES,
		PRETRANSFORM,
		COMPOSITEALPHA,
		PRESENTMODE,
		CLIPPED,
		OLDSWAPCHAIN;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(4),
			__member(4),
			__member(4),
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		SURFACE = layout.offsetof(3);
		MINIMAGECOUNT = layout.offsetof(4);
		IMAGEFORMAT = layout.offsetof(5);
		IMAGECOLORSPACE = layout.offsetof(6);
		IMAGEEXTENT = layout.offsetof(7);
		IMAGEARRAYLAYERS = layout.offsetof(8);
		IMAGEUSAGE = layout.offsetof(9);
		IMAGESHARINGMODE = layout.offsetof(10);
		QUEUEFAMILYINDEXCOUNT = layout.offsetof(11);
		PQUEUEFAMILYINDICES = layout.offsetof(12);
		PRETRANSFORM = layout.offsetof(13);
		COMPOSITEALPHA = layout.offsetof(14);
		PRESENTMODE = layout.offsetof(15);
		CLIPPED = layout.offsetof(16);
		OLDSWAPCHAIN = layout.offsetof(17);
	}

	VkSwapchainCreateInfoKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSwapchainCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSwapchainCreateInfoKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code surface} field. */
	public long surface() { return nsurface(address()); }
	/** Returns the value of the {@code minImageCount} field. */
	public int minImageCount() { return nminImageCount(address()); }
	/** Returns the value of the {@code imageFormat} field. */
	public int imageFormat() { return nimageFormat(address()); }
	/** Returns the value of the {@code imageColorSpace} field. */
	public int imageColorSpace() { return nimageColorSpace(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code imageExtent} field. */
	public VkExtent2D imageExtent() { return nimageExtent(address()); }
	/** Returns the value of the {@code imageArrayLayers} field. */
	public int imageArrayLayers() { return nimageArrayLayers(address()); }
	/** Returns the value of the {@code imageUsage} field. */
	public int imageUsage() { return nimageUsage(address()); }
	/** Returns the value of the {@code imageSharingMode} field. */
	public int imageSharingMode() { return nimageSharingMode(address()); }
	/** Returns the value of the {@code queueFamilyIndexCount} field. */
	public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
	public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
	/** Returns the value of the {@code preTransform} field. */
	public int preTransform() { return npreTransform(address()); }
	/** Returns the value of the {@code compositeAlpha} field. */
	public int compositeAlpha() { return ncompositeAlpha(address()); }
	/** Returns the value of the {@code presentMode} field. */
	public int presentMode() { return npresentMode(address()); }
	/** Returns the value of the {@code clipped} field. */
	public int clipped() { return nclipped(address()); }
	/** Returns the value of the {@code oldSwapchain} field. */
	public long oldSwapchain() { return noldSwapchain(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkSwapchainCreateInfoKHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkSwapchainCreateInfoKHR pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkSwapchainCreateInfoKHR flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code surface} field. */
	public VkSwapchainCreateInfoKHR surface(long value) { nsurface(address(), value); return this; }
	/** Sets the specified value to the {@code minImageCount} field. */
	public VkSwapchainCreateInfoKHR minImageCount(int value) { nminImageCount(address(), value); return this; }
	/** Sets the specified value to the {@code imageFormat} field. */
	public VkSwapchainCreateInfoKHR imageFormat(int value) { nimageFormat(address(), value); return this; }
	/** Sets the specified value to the {@code imageColorSpace} field. */
	public VkSwapchainCreateInfoKHR imageColorSpace(int value) { nimageColorSpace(address(), value); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
	public VkSwapchainCreateInfoKHR imageExtent(VkExtent2D value) { nimageExtent(address(), value); return this; }
	/** Sets the specified value to the {@code imageArrayLayers} field. */
	public VkSwapchainCreateInfoKHR imageArrayLayers(int value) { nimageArrayLayers(address(), value); return this; }
	/** Sets the specified value to the {@code imageUsage} field. */
	public VkSwapchainCreateInfoKHR imageUsage(int value) { nimageUsage(address(), value); return this; }
	/** Sets the specified value to the {@code imageSharingMode} field. */
	public VkSwapchainCreateInfoKHR imageSharingMode(int value) { nimageSharingMode(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
	public VkSwapchainCreateInfoKHR pQueueFamilyIndices(IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
	/** Sets the specified value to the {@code preTransform} field. */
	public VkSwapchainCreateInfoKHR preTransform(int value) { npreTransform(address(), value); return this; }
	/** Sets the specified value to the {@code compositeAlpha} field. */
	public VkSwapchainCreateInfoKHR compositeAlpha(int value) { ncompositeAlpha(address(), value); return this; }
	/** Sets the specified value to the {@code presentMode} field. */
	public VkSwapchainCreateInfoKHR presentMode(int value) { npresentMode(address(), value); return this; }
	/** Sets the specified value to the {@code clipped} field. */
	public VkSwapchainCreateInfoKHR clipped(int value) { nclipped(address(), value); return this; }
	/** Sets the specified value to the {@code oldSwapchain} field. */
	public VkSwapchainCreateInfoKHR oldSwapchain(long value) { noldSwapchain(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSwapchainCreateInfoKHR set(
		int sType,
		long pNext,
		int flags,
		long surface,
		int minImageCount,
		int imageFormat,
		int imageColorSpace,
		VkExtent2D imageExtent,
		int imageArrayLayers,
		int imageUsage,
		int imageSharingMode,
		IntBuffer pQueueFamilyIndices,
		int preTransform,
		int compositeAlpha,
		int presentMode,
		int clipped,
		long oldSwapchain
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		surface(surface);
		minImageCount(minImageCount);
		imageFormat(imageFormat);
		imageColorSpace(imageColorSpace);
		imageExtent(imageExtent);
		imageArrayLayers(imageArrayLayers);
		imageUsage(imageUsage);
		imageSharingMode(imageSharingMode);
		pQueueFamilyIndices(pQueueFamilyIndices);
		preTransform(preTransform);
		compositeAlpha(compositeAlpha);
		presentMode(presentMode);
		clipped(clipped);
		oldSwapchain(oldSwapchain);

		return this;
	}

	/** Unsafe version of {@link #set(VkSwapchainCreateInfoKHR) set}. */
	public VkSwapchainCreateInfoKHR nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkSwapchainCreateInfoKHR set(VkSwapchainCreateInfoKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSwapchainCreateInfoKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSwapchainCreateInfoKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated with {@link BufferUtils}. */
	public static VkSwapchainCreateInfoKHR create() {
		return new VkSwapchainCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSwapchainCreateInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSwapchainCreateInfoKHR create(long address) {
		return address == NULL ? null : new VkSwapchainCreateInfoKHR(address, null);
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSwapchainCreateInfoKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSwapchainCreateInfoKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSwapchainCreateInfoKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSwapchainCreateInfoKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSwapchainCreateInfoKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainCreateInfoKHR.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.FLAGS); }
	/** Unsafe version of {@link #surface}. */
	public static long nsurface(long struct) { return memGetLong(struct + VkSwapchainCreateInfoKHR.SURFACE); }
	/** Unsafe version of {@link #minImageCount}. */
	public static int nminImageCount(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.MINIMAGECOUNT); }
	/** Unsafe version of {@link #imageFormat}. */
	public static int nimageFormat(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEFORMAT); }
	/** Unsafe version of {@link #imageColorSpace}. */
	public static int nimageColorSpace(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGECOLORSPACE); }
	/** Unsafe version of {@link #imageExtent}. */
	public static VkExtent2D nimageExtent(long struct) { return VkExtent2D.create(struct + VkSwapchainCreateInfoKHR.IMAGEEXTENT); }
	/** Unsafe version of {@link #imageArrayLayers}. */
	public static int nimageArrayLayers(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS); }
	/** Unsafe version of {@link #imageUsage}. */
	public static int nimageUsage(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEUSAGE); }
	/** Unsafe version of {@link #imageSharingMode}. */
	public static int nimageSharingMode(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGESHARINGMODE); }
	/** Unsafe version of {@link #queueFamilyIndexCount}. */
	public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT); }
	/** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
	public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }
	/** Unsafe version of {@link #preTransform}. */
	public static int npreTransform(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.PRETRANSFORM); }
	/** Unsafe version of {@link #compositeAlpha}. */
	public static int ncompositeAlpha(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.COMPOSITEALPHA); }
	/** Unsafe version of {@link #presentMode}. */
	public static int npresentMode(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.PRESENTMODE); }
	/** Unsafe version of {@link #clipped}. */
	public static int nclipped(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.CLIPPED); }
	/** Unsafe version of {@link #oldSwapchain}. */
	public static long noldSwapchain(long struct) { return memGetLong(struct + VkSwapchainCreateInfoKHR.OLDSWAPCHAIN); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainCreateInfoKHR.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.FLAGS, value); }
	/** Unsafe version of {@link #surface(long) surface}. */
	public static void nsurface(long struct, long value) { memPutLong(struct + VkSwapchainCreateInfoKHR.SURFACE, value); }
	/** Unsafe version of {@link #minImageCount(int) minImageCount}. */
	public static void nminImageCount(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.MINIMAGECOUNT, value); }
	/** Unsafe version of {@link #imageFormat(int) imageFormat}. */
	public static void nimageFormat(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEFORMAT, value); }
	/** Unsafe version of {@link #imageColorSpace(int) imageColorSpace}. */
	public static void nimageColorSpace(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGECOLORSPACE, value); }
	/** Unsafe version of {@link #imageExtent(VkExtent2D) imageExtent}. */
	public static void nimageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSwapchainCreateInfoKHR.IMAGEEXTENT, VkExtent2D.SIZEOF); }
	/** Unsafe version of {@link #imageArrayLayers(int) imageArrayLayers}. */
	public static void nimageArrayLayers(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS, value); }
	/** Unsafe version of {@link #imageUsage(int) imageUsage}. */
	public static void nimageUsage(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEUSAGE, value); }
	/** Unsafe version of {@link #imageSharingMode(int) imageSharingMode}. */
	public static void nimageSharingMode(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGESHARINGMODE, value); }
	/** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
	public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT, value); }
	/** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
	public static void npQueueFamilyIndices(long struct, IntBuffer value) { memPutAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES, memAddressSafe(value)); nqueueFamilyIndexCount(struct, value == null ? 0 : value.remaining()); }
	/** Unsafe version of {@link #preTransform(int) preTransform}. */
	public static void npreTransform(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.PRETRANSFORM, value); }
	/** Unsafe version of {@link #compositeAlpha(int) compositeAlpha}. */
	public static void ncompositeAlpha(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.COMPOSITEALPHA, value); }
	/** Unsafe version of {@link #presentMode(int) presentMode}. */
	public static void npresentMode(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.PRESENTMODE, value); }
	/** Unsafe version of {@link #clipped(int) clipped}. */
	public static void nclipped(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.CLIPPED, value); }
	/** Unsafe version of {@link #oldSwapchain(long) oldSwapchain}. */
	public static void noldSwapchain(long struct, long value) { memPutLong(struct + VkSwapchainCreateInfoKHR.OLDSWAPCHAIN, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nqueueFamilyIndexCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkSwapchainCreateInfoKHR} structs. */
	public static final class Buffer extends StructBuffer<VkSwapchainCreateInfoKHR, Buffer> {

		/**
		 * Creates a new {@link VkSwapchainCreateInfoKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSwapchainCreateInfoKHR#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected VkSwapchainCreateInfoKHR newInstance(long address) {
			return new VkSwapchainCreateInfoKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkSwapchainCreateInfoKHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkSwapchainCreateInfoKHR.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkSwapchainCreateInfoKHR.nflags(address()); }
		/** Returns the value of the {@code surface} field. */
		public long surface() { return VkSwapchainCreateInfoKHR.nsurface(address()); }
		/** Returns the value of the {@code minImageCount} field. */
		public int minImageCount() { return VkSwapchainCreateInfoKHR.nminImageCount(address()); }
		/** Returns the value of the {@code imageFormat} field. */
		public int imageFormat() { return VkSwapchainCreateInfoKHR.nimageFormat(address()); }
		/** Returns the value of the {@code imageColorSpace} field. */
		public int imageColorSpace() { return VkSwapchainCreateInfoKHR.nimageColorSpace(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code imageExtent} field. */
		public VkExtent2D imageExtent() { return VkSwapchainCreateInfoKHR.nimageExtent(address()); }
		/** Returns the value of the {@code imageArrayLayers} field. */
		public int imageArrayLayers() { return VkSwapchainCreateInfoKHR.nimageArrayLayers(address()); }
		/** Returns the value of the {@code imageUsage} field. */
		public int imageUsage() { return VkSwapchainCreateInfoKHR.nimageUsage(address()); }
		/** Returns the value of the {@code imageSharingMode} field. */
		public int imageSharingMode() { return VkSwapchainCreateInfoKHR.nimageSharingMode(address()); }
		/** Returns the value of the {@code queueFamilyIndexCount} field. */
		public int queueFamilyIndexCount() { return VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
		public IntBuffer pQueueFamilyIndices() { return VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address()); }
		/** Returns the value of the {@code preTransform} field. */
		public int preTransform() { return VkSwapchainCreateInfoKHR.npreTransform(address()); }
		/** Returns the value of the {@code compositeAlpha} field. */
		public int compositeAlpha() { return VkSwapchainCreateInfoKHR.ncompositeAlpha(address()); }
		/** Returns the value of the {@code presentMode} field. */
		public int presentMode() { return VkSwapchainCreateInfoKHR.npresentMode(address()); }
		/** Returns the value of the {@code clipped} field. */
		public int clipped() { return VkSwapchainCreateInfoKHR.nclipped(address()); }
		/** Returns the value of the {@code oldSwapchain} field. */
		public long oldSwapchain() { return VkSwapchainCreateInfoKHR.noldSwapchain(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkSwapchainCreateInfoKHR.Buffer sType(int value) { VkSwapchainCreateInfoKHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkSwapchainCreateInfoKHR.Buffer pNext(long value) { VkSwapchainCreateInfoKHR.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkSwapchainCreateInfoKHR.Buffer flags(int value) { VkSwapchainCreateInfoKHR.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code surface} field. */
		public VkSwapchainCreateInfoKHR.Buffer surface(long value) { VkSwapchainCreateInfoKHR.nsurface(address(), value); return this; }
		/** Sets the specified value to the {@code minImageCount} field. */
		public VkSwapchainCreateInfoKHR.Buffer minImageCount(int value) { VkSwapchainCreateInfoKHR.nminImageCount(address(), value); return this; }
		/** Sets the specified value to the {@code imageFormat} field. */
		public VkSwapchainCreateInfoKHR.Buffer imageFormat(int value) { VkSwapchainCreateInfoKHR.nimageFormat(address(), value); return this; }
		/** Sets the specified value to the {@code imageColorSpace} field. */
		public VkSwapchainCreateInfoKHR.Buffer imageColorSpace(int value) { VkSwapchainCreateInfoKHR.nimageColorSpace(address(), value); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
		public VkSwapchainCreateInfoKHR.Buffer imageExtent(VkExtent2D value) { VkSwapchainCreateInfoKHR.nimageExtent(address(), value); return this; }
		/** Sets the specified value to the {@code imageArrayLayers} field. */
		public VkSwapchainCreateInfoKHR.Buffer imageArrayLayers(int value) { VkSwapchainCreateInfoKHR.nimageArrayLayers(address(), value); return this; }
		/** Sets the specified value to the {@code imageUsage} field. */
		public VkSwapchainCreateInfoKHR.Buffer imageUsage(int value) { VkSwapchainCreateInfoKHR.nimageUsage(address(), value); return this; }
		/** Sets the specified value to the {@code imageSharingMode} field. */
		public VkSwapchainCreateInfoKHR.Buffer imageSharingMode(int value) { VkSwapchainCreateInfoKHR.nimageSharingMode(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
		public VkSwapchainCreateInfoKHR.Buffer pQueueFamilyIndices(IntBuffer value) { VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address(), value); return this; }
		/** Sets the specified value to the {@code preTransform} field. */
		public VkSwapchainCreateInfoKHR.Buffer preTransform(int value) { VkSwapchainCreateInfoKHR.npreTransform(address(), value); return this; }
		/** Sets the specified value to the {@code compositeAlpha} field. */
		public VkSwapchainCreateInfoKHR.Buffer compositeAlpha(int value) { VkSwapchainCreateInfoKHR.ncompositeAlpha(address(), value); return this; }
		/** Sets the specified value to the {@code presentMode} field. */
		public VkSwapchainCreateInfoKHR.Buffer presentMode(int value) { VkSwapchainCreateInfoKHR.npresentMode(address(), value); return this; }
		/** Sets the specified value to the {@code clipped} field. */
		public VkSwapchainCreateInfoKHR.Buffer clipped(int value) { VkSwapchainCreateInfoKHR.nclipped(address(), value); return this; }
		/** Sets the specified value to the {@code oldSwapchain} field. */
		public VkSwapchainCreateInfoKHR.Buffer oldSwapchain(long value) { VkSwapchainCreateInfoKHR.noldSwapchain(address(), value); return this; }

	}

}