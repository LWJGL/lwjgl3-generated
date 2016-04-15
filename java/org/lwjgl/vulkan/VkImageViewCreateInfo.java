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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkImageViewCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkImageViewCreateInfo">Vulkan Specification</a>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code viewType} <b>must</b> be a valid {@code VkImageViewType} value</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code components} <b>must</b> be a valid {@link VkComponentMapping} structure</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * <li>If {@code image} was not created with {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} then {@code viewType} <b>must not</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE} or
 * {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
 * <li>If the image cubemap arrays feature is not enabled, {@code viewType} <b>must not</b> be {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</li>
 * <li>If the ETC2 texture compression feature is not enabled, {@code format} <b>must not</b> be {@link VK10#VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK FORMAT_ETC2_R8G8B8_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK FORMAT_ETC2_R8G8B8_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_EAC_R11_UNORM_BLOCK FORMAT_EAC_R11_UNORM_BLOCK}, {@link VK10#VK_FORMAT_EAC_R11_SNORM_BLOCK FORMAT_EAC_R11_SNORM_BLOCK}, {@link VK10#VK_FORMAT_EAC_R11G11_UNORM_BLOCK FORMAT_EAC_R11G11_UNORM_BLOCK}, or {@link VK10#VK_FORMAT_EAC_R11G11_SNORM_BLOCK FORMAT_EAC_R11G11_SNORM_BLOCK}</li>
 * <li>If the ASTC LDR texture compression feature is not enabled, {@code format} <b>must not</b> be {@link VK10#VK_FORMAT_ASTC_4x4_UNORM_BLOCK FORMAT_ASTC_4x4_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_4x4_SRGB_BLOCK FORMAT_ASTC_4x4_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_5x4_UNORM_BLOCK FORMAT_ASTC_5x4_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_5x4_SRGB_BLOCK FORMAT_ASTC_5x4_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_5x5_UNORM_BLOCK FORMAT_ASTC_5x5_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_5x5_SRGB_BLOCK FORMAT_ASTC_5x5_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_6x5_UNORM_BLOCK FORMAT_ASTC_6x5_UNORM_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_6x5_SRGB_BLOCK FORMAT_ASTC_6x5_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_6x6_UNORM_BLOCK FORMAT_ASTC_6x6_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_6x6_SRGB_BLOCK FORMAT_ASTC_6x6_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x5_UNORM_BLOCK FORMAT_ASTC_8x5_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x5_SRGB_BLOCK FORMAT_ASTC_8x5_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_8x6_UNORM_BLOCK FORMAT_ASTC_8x6_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x6_SRGB_BLOCK FORMAT_ASTC_8x6_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x8_UNORM_BLOCK FORMAT_ASTC_8x8_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_8x8_SRGB_BLOCK FORMAT_ASTC_8x8_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_10x5_UNORM_BLOCK FORMAT_ASTC_10x5_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x5_SRGB_BLOCK FORMAT_ASTC_10x5_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x6_UNORM_BLOCK FORMAT_ASTC_10x6_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x6_SRGB_BLOCK FORMAT_ASTC_10x6_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_10x8_UNORM_BLOCK FORMAT_ASTC_10x8_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x8_SRGB_BLOCK FORMAT_ASTC_10x8_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x10_UNORM_BLOCK FORMAT_ASTC_10x10_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_10x10_SRGB_BLOCK FORMAT_ASTC_10x10_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_ASTC_12x10_UNORM_BLOCK FORMAT_ASTC_12x10_UNORM_BLOCK}, {@link VK10#VK_FORMAT_ASTC_12x10_SRGB_BLOCK FORMAT_ASTC_12x10_SRGB_BLOCK}, {@link VK10#VK_FORMAT_ASTC_12x12_UNORM_BLOCK FORMAT_ASTC_12x12_UNORM_BLOCK}, or {@link VK10#VK_FORMAT_ASTC_12x12_SRGB_BLOCK FORMAT_ASTC_12x12_SRGB_BLOCK}</li>
 * <li>If the BC texture compression feature is not enabled, {@code format} <b>must not</b> be {@link VK10#VK_FORMAT_BC1_RGB_UNORM_BLOCK FORMAT_BC1_RGB_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC1_RGB_SRGB_BLOCK FORMAT_BC1_RGB_SRGB_BLOCK},
 * {@link VK10#VK_FORMAT_BC1_RGBA_UNORM_BLOCK FORMAT_BC1_RGBA_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC1_RGBA_SRGB_BLOCK FORMAT_BC1_RGBA_SRGB_BLOCK}, {@link VK10#VK_FORMAT_BC2_UNORM_BLOCK FORMAT_BC2_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC2_SRGB_BLOCK FORMAT_BC2_SRGB_BLOCK}, {@link VK10#VK_FORMAT_BC3_UNORM_BLOCK FORMAT_BC3_UNORM_BLOCK},
 * {@link VK10#VK_FORMAT_BC3_SRGB_BLOCK FORMAT_BC3_SRGB_BLOCK}, {@link VK10#VK_FORMAT_BC4_UNORM_BLOCK FORMAT_BC4_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC4_SNORM_BLOCK FORMAT_BC4_SNORM_BLOCK}, {@link VK10#VK_FORMAT_BC5_UNORM_BLOCK FORMAT_BC5_UNORM_BLOCK}, {@link VK10#VK_FORMAT_BC5_SNORM_BLOCK FORMAT_BC5_SNORM_BLOCK},
 * {@link VK10#VK_FORMAT_BC6H_UFLOAT_BLOCK FORMAT_BC6H_UFLOAT_BLOCK}, {@link VK10#VK_FORMAT_BC6H_SFLOAT_BLOCK FORMAT_BC6H_SFLOAT_BLOCK}, {@link VK10#VK_FORMAT_BC7_UNORM_BLOCK FORMAT_BC7_UNORM_BLOCK}, or {@link VK10#VK_FORMAT_BC7_SRGB_BLOCK FORMAT_BC7_SRGB_BLOCK}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, {@code format} <b>must</b> be supported for
 * sampled images, as specified by the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code format} <b>must</b> be supported for
 * storage images, as specified by the {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT} flag in {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@code format} <b>must</b> be
 * supported for color attachments, as specified by the {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in
 * {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@code format} <b>must</b>
 * be supported for depth/stencil attachments, as specified by the {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT} flag in
 * {@link VkFormatProperties}{@code ::linearTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, {@code format} <b>must</b> be supported
 * for sampled images, as specified by the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT} flag in {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}, {@code format} <b>must</b> be supported
 * for storage images, as specified by the {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT} flag in {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by
 * {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}, {@code format} <b>must</b> be
 * supported for color attachments, as specified by the {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} flag in
 * {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>If {@code image} was created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@code format}
 * <b>must</b> be supported for depth/stencil attachments, as specified by the {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT} flag in
 * {@link VkFormatProperties}{@code ::optimalTilingFeatures} returned by {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid image subresource range for {@code image}</li>
 * <li>If {@code image} was created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, {@code format} <b>must</b> be compatible with the {@code format} used to
 * create {@code image}, as defined in Format Compatibility Classes</li>
 * <li>If {@code image} was not created with the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} flag, {@code format} <b>must</b> be identical to the {@code format} used to
 * create {@code image}</li>
 * <li>{@code subResourceRange} and {@code viewType} <b>must</b> be compatible with the image, as described in the table below</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code image} &ndash; a {@code VkImage} on which the view will be created</li>
 * <li>{@code viewType} &ndash; the type of the image view. One of:<br><table><tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_1D IMAGE_VIEW_TYPE_1D}</td><td>{@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}</td><td>{@link VK10#VK_IMAGE_VIEW_TYPE_2D IMAGE_VIEW_TYPE_2D}</td></tr><tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY}</td><td>{@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}</td><td>{@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}</td></tr><tr><td>{@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}</td></tr></table></li>
 * <li>{@code format} &ndash; a {@code VkFormat} describing the format and type used to interpret data elements in the image</li>
 * <li>{@code components} &ndash; a remapping of color components (or of depth or stencil components after they have been converted into color components)</li>
 * <li>{@code subresourceRange} &ndash; selects the set of mipmap levels and array layers to be accessible to the view</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImageViewCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkImageViewCreateFlags flags;
    VkImage image;
    VkImageViewType viewType;
    VkFormat format;
    {@link VkComponentMapping VkComponentMapping} components;
    {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
}</code></pre>
 */
public class VkImageViewCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		IMAGE,
		VIEWTYPE,
		FORMAT,
		COMPONENTS,
		SUBRESOURCERANGE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(4),
			__member(4),
			__member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
			__member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		IMAGE = layout.offsetof(3);
		VIEWTYPE = layout.offsetof(4);
		FORMAT = layout.offsetof(5);
		COMPONENTS = layout.offsetof(6);
		SUBRESOURCERANGE = layout.offsetof(7);
	}

	VkImageViewCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageViewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageViewCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns the value of the {@code viewType} field. */
	public int viewType() { return nviewType(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns a {@link VkComponentMapping} view of the {@code components} field. */
	public VkComponentMapping components() { return ncomponents(address()); }
	/** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
	public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkImageViewCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkImageViewCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkImageViewCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code image} field. */
	public VkImageViewCreateInfo image(long value) { nimage(address(), value); return this; }
	/** Sets the specified value to the {@code viewType} field. */
	public VkImageViewCreateInfo viewType(int value) { nviewType(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkImageViewCreateInfo format(int value) { nformat(address(), value); return this; }
	/** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
	public VkImageViewCreateInfo components(VkComponentMapping value) { ncomponents(address(), value); return this; }
	/** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
	public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageViewCreateInfo set(
		int sType,
		long pNext,
		int flags,
		long image,
		int viewType,
		int format,
		VkComponentMapping components,
		VkImageSubresourceRange subresourceRange
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		image(image);
		viewType(viewType);
		format(format);
		components(components);
		subresourceRange(subresourceRange);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageViewCreateInfo) set}. */
	public VkImageViewCreateInfo nset(long struct) {
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
	public VkImageViewCreateInfo set(VkImageViewCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageViewCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageViewCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageViewCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkImageViewCreateInfo create() {
		return new VkImageViewCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageViewCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageViewCreateInfo create(long address) {
		return address == NULL ? null : new VkImageViewCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageViewCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkImageViewCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkImageViewCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkImageViewCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkImageViewCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageViewCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImageViewCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkImageViewCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkImageViewCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkImageViewCreateInfo.FLAGS); }
	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetLong(struct + VkImageViewCreateInfo.IMAGE); }
	/** Unsafe version of {@link #viewType}. */
	public static int nviewType(long struct) { return memGetInt(struct + VkImageViewCreateInfo.VIEWTYPE); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkImageViewCreateInfo.FORMAT); }
	/** Unsafe version of {@link #components}. */
	public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkImageViewCreateInfo.COMPONENTS); }
	/** Unsafe version of {@link #subresourceRange}. */
	public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageViewCreateInfo.SUBRESOURCERANGE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutLong(struct + VkImageViewCreateInfo.IMAGE, value); }
	/** Unsafe version of {@link #viewType(int) viewType}. */
	public static void nviewType(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.VIEWTYPE, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkImageViewCreateInfo.FORMAT, value); }
	/** Unsafe version of {@link #components(VkComponentMapping) components}. */
	public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkImageViewCreateInfo.COMPONENTS, VkComponentMapping.SIZEOF); }
	/** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
	public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageViewCreateInfo.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkImageViewCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkImageViewCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkImageViewCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageViewCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkImageViewCreateInfo newInstance(long address) {
			return new VkImageViewCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkImageViewCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkImageViewCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkImageViewCreateInfo.nflags(address()); }
		/** Returns the value of the {@code image} field. */
		public long image() { return VkImageViewCreateInfo.nimage(address()); }
		/** Returns the value of the {@code viewType} field. */
		public int viewType() { return VkImageViewCreateInfo.nviewType(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkImageViewCreateInfo.nformat(address()); }
		/** Returns a {@link VkComponentMapping} view of the {@code components} field. */
		public VkComponentMapping components() { return VkImageViewCreateInfo.ncomponents(address()); }
		/** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
		public VkImageSubresourceRange subresourceRange() { return VkImageViewCreateInfo.nsubresourceRange(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkImageViewCreateInfo.Buffer sType(int value) { VkImageViewCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkImageViewCreateInfo.Buffer pNext(long value) { VkImageViewCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkImageViewCreateInfo.Buffer flags(int value) { VkImageViewCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code image} field. */
		public VkImageViewCreateInfo.Buffer image(long value) { VkImageViewCreateInfo.nimage(address(), value); return this; }
		/** Sets the specified value to the {@code viewType} field. */
		public VkImageViewCreateInfo.Buffer viewType(int value) { VkImageViewCreateInfo.nviewType(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkImageViewCreateInfo.Buffer format(int value) { VkImageViewCreateInfo.nformat(address(), value); return this; }
		/** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
		public VkImageViewCreateInfo.Buffer components(VkComponentMapping value) { VkImageViewCreateInfo.ncomponents(address(), value); return this; }
		/** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
		public VkImageViewCreateInfo.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageViewCreateInfo.nsubresourceRange(address(), value); return this; }

	}

}