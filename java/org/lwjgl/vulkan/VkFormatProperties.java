/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying image format properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>Supported features are described as a set of {@code VkFormatFeatureFlagBits}:</p>
 * 
 * <pre><code>typedef enum VkFormatFeatureFlagBits {
    VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 0x00000001,
    VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 0x00000002,
    VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 0x00000004,
    VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000008,
    VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 0x00000010,
    VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x00000020,
    VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 0x00000040,
    VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 0x00000080,
    VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 0x00000100,
    VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000200,
    VK_FORMAT_FEATURE_BLIT_SRC_BIT = 0x00000400,
    VK_FORMAT_FEATURE_BLIT_DST_BIT = 0x00000800,
    VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x00001000,
    VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG = 0x00002000,
} VkFormatFeatureFlagBits;</code></pre>
 * 
 * <p>The {@code linearTilingFeatures} and {@code optimalTilingFeatures} members of the {@link VkFormatProperties} structure describe what features are supported by {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL} images, respectively.</p>
 * 
 * <p>The following bits <b>may</b> be set in {@code linearTilingFeatures} and {@code optimalTilingFeatures}, indicating they are supported by images or image views created with the queried {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}{@code ::format}:</p>
 * 
 * <dl>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}</dt>
 * <dd>{@code VkImageView} <b>can</b> be sampled from. See <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-sampledimage">sampled images</a> section.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT}</dt>
 * <dd>{@code VkImageView} <b>can</b> be used as storage image. See <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-storageimage">storage images</a> section.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</dt>
 * <dd>{@code VkImageView} <b>can</b> be used as storage image that supports atomic operations.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</dt>
 * <dd>{@code VkImageView} <b>can</b> be used as a framebuffer color attachment and as an input attachment.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}</dt>
 * <dd>{@code VkImageView} <b>can</b> be used as a framebuffer color attachment that supports blending and as an input attachment.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</dt>
 * <dd>{@code VkImageView} <b>can</b> be used as a framebuffer depth/stencil attachment and as an input attachment.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</dt>
 * <dd>{@code VkImage} <b>can</b> be used as {@code srcImage} for the {@link VK10#vkCmdBlitImage CmdBlitImage} command.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}</dt>
 * <dd>{@code VkImage} <b>can</b> be used as {@code dstImage} for the {@link VK10#vkCmdBlitImage CmdBlitImage} command.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</dt>
 * <dd>If the format being queried is a depth/stencil format, this bit only     indicates that the depth aspect (not the stencil aspect) of an image of     this format supports linear filtering, and that linear filtering of the     depth aspect is supported whether depth compare is enabled in the     sampler or not.     If this bit is not present, linear filtering with depth compare disabled     is unsupported and linear filtering with depth compare enabled is     supported, but <b>may</b> compute the filtered value in an     implementation-dependent manner which differs from the normal rules of     linear filtering.     The resulting value <b>must</b> be in the range <code>[0,1]</code> and <b>should</b> be     proportional to, or a weighted average of, the number of comparison     passes or failures.</dd>
 * <dt>{@link IMGFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG}</dt>
 * <dd>{@code VkImage} <b>can</b> be used with a sampler that has either of {@code magFilter} or {@code minFilter} set to {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG}, or be the source image for a blit with {@code filter} set to {@link IMGFilterCubic#VK_FILTER_CUBIC_IMG FILTER_CUBIC_IMG}. This bit <b>must</b> only be exposed for formats that also support the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}. If the format being queried is a depth/stencil format, this only indicates that the depth aspect is cubic filterable.</dd>
 * </dl>
 * 
 * <p>The following features <b>may</b> appear in {@code bufferFeatures}, indicating they are supported by buffers or buffer views created with the queried {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}{@code ::format}:</p>
 * 
 * <dl>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT}</dt>
 * <dd>Format <b>can</b> be used to create a {@code VkBufferView} that <b>can</b> be bound to a {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} descriptor.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT}</dt>
 * <dd>Format <b>can</b> be used to create a {@code VkBufferView} that <b>can</b> be bound to a {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} descriptor.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT}</dt>
 * <dd>Atomic operations are supported on {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} with this format.</dd>
 * <dt>{@link VK10#VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT FORMAT_FEATURE_VERTEX_BUFFER_BIT}</dt>
 * <dd>Format <b>can</b> be used as a vertex attribute format ({@link VkVertexInputAttributeDescription}{@code ::format}).</dd>
 * </dl>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If no format feature flags are supported, then the only possible use would be image transfers - which alone are not useful. As such, if no format feature flags are supported, the format itself is not supported, and images of that format cannot be created.</p>
 * </div>
 * 
 * <p>If {@code format} is a block-compression format, then buffers <b>must</b> not support any features for the format.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code linearTilingFeatures} &ndash; describes the features supported by {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}.</li>
 * <li>{@code optimalTilingFeatures} &ndash; describes the features supported by {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}.</li>
 * <li>{@code bufferFeatures} &ndash; describes the features supported by buffers.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkFormatProperties {
    VkFormatFeatureFlags linearTilingFeatures;
    VkFormatFeatureFlags optimalTilingFeatures;
    VkFormatFeatureFlags bufferFeatures;
}</code></pre>
 */
public class VkFormatProperties extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		LINEARTILINGFEATURES,
		OPTIMALTILINGFEATURES,
		BUFFERFEATURES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		LINEARTILINGFEATURES = layout.offsetof(0);
		OPTIMALTILINGFEATURES = layout.offsetof(1);
		BUFFERFEATURES = layout.offsetof(2);
	}

	VkFormatProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkFormatProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code linearTilingFeatures} field. */
	public int linearTilingFeatures() { return nlinearTilingFeatures(address()); }
	/** Returns the value of the {@code optimalTilingFeatures} field. */
	public int optimalTilingFeatures() { return noptimalTilingFeatures(address()); }
	/** Returns the value of the {@code bufferFeatures} field. */
	public int bufferFeatures() { return nbufferFeatures(address()); }

	// -----------------------------------

	/** Returns a new {@link VkFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkFormatProperties malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkFormatProperties calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkFormatProperties} instance allocated with {@link BufferUtils}. */
	public static VkFormatProperties create() {
		return new VkFormatProperties(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkFormatProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkFormatProperties create(long address) {
		return address == NULL ? null : new VkFormatProperties(address, null);
	}

	/**
	 * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkFormatProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkFormatProperties} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkFormatProperties mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkFormatProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkFormatProperties callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkFormatProperties} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkFormatProperties mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkFormatProperties callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #linearTilingFeatures}. */
	public static int nlinearTilingFeatures(long struct) { return memGetInt(struct + VkFormatProperties.LINEARTILINGFEATURES); }
	/** Unsafe version of {@link #optimalTilingFeatures}. */
	public static int noptimalTilingFeatures(long struct) { return memGetInt(struct + VkFormatProperties.OPTIMALTILINGFEATURES); }
	/** Unsafe version of {@link #bufferFeatures}. */
	public static int nbufferFeatures(long struct) { return memGetInt(struct + VkFormatProperties.BUFFERFEATURES); }

	// -----------------------------------

	/** An array of {@link VkFormatProperties} structs. */
	public static class Buffer extends StructBuffer<VkFormatProperties, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkFormatProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkFormatProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkFormatProperties newInstance(long address) {
			return new VkFormatProperties(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code linearTilingFeatures} field. */
		public int linearTilingFeatures() { return VkFormatProperties.nlinearTilingFeatures(address()); }
		/** Returns the value of the {@code optimalTilingFeatures} field. */
		public int optimalTilingFeatures() { return VkFormatProperties.noptimalTilingFeatures(address()); }
		/** Returns the value of the {@code bufferFeatures} field. */
		public int bufferFeatures() { return VkFormatProperties.nbufferFeatures(address()); }

	}

}