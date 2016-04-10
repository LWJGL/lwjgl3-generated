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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkFramebufferCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkFramebufferCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a framebuffer should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
 * <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a pointer to an array of {@code attachmentCount} valid {@code VkImageView}
 * handles</li>
 * <li>Each of {@code renderPass} and the elements of {@code pAttachments} that are valid handles <b>must</b> have been created, allocated or retrieved from the
 * same {@code VkDevice}</li>
 * <li>{@code attachmentCount} <b>must</b> be equal to the attachment count specified in {@code renderPass}</li>
 * <li>Any given element of {@code pAttachments} that is used as a color attachment or resolve attachment by {@code renderPass} <b>must</b> have been created
 * with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>Any given element of {@code pAttachments} that is used as a depth/stencil attachment by {@code renderPass} <b>must</b> have been created with a
 * {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>Any given element of {@code pAttachments} that is used as an input attachment by {@code renderPass} <b>must</b> have been created with a {@code usage}
 * value including {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>Any given element of {@code pAttachments} <b>must</b> have been created with an {@code VkFormat} value that matches the {@code VkFormat} specified by the
 * corresponding {@code VkAttachmentDescription} in {@code renderPass}</li>
 * <li>Any given element of {@code pAttachments} <b>must</b> have been created with a {@code samples} value that matches the {@code samples} value specified by
 * the corresponding {@code VkAttachmentDescription} in {@code renderPass}</li>
 * <li>Any given element of {@code pAttachments} <b>must</b> have dimensions at least as large as the corresponding framebuffer dimension</li>
 * <li>Any given element of {@code pAttachments} <b>must</b> only specify a single mip-level</li>
 * <li>Any given element of {@code pAttachments} <b>must</b> have been created with the identity swizzle</li>
 * <li>{@code width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferWidth}</li>
 * <li>{@code height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferHeight}</li>
 * <li>{@code layers} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferLayers}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code renderPass} &ndash; a render pass that defines what render passes the framebuffer will be compatible with</li>
 * <li>{@code attachmentCount} &ndash; the number of attachments</li>
 * <li>{@code pAttachments} &ndash; an array of {@code VkImageView} handles, each of which will be used as the corresponding attachment in a render pass instance</li>
 * <li>{@code width} &ndash; the framebuffer width</li>
 * <li>{@code height} &ndash; the framebuffer height</li>
 * <li>{@code layers} &ndash; the number of layers in the framebuffer</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkFramebufferCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkFramebufferCreateFlags flags;
    VkRenderPass renderPass;
    uint32_t attachmentCount;
    const VkImageView * pAttachments;
    uint32_t width;
    uint32_t height;
    uint32_t layers;
}</code></pre>
 */
public class VkFramebufferCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		RENDERPASS,
		ATTACHMENTCOUNT,
		PATTACHMENTS,
		WIDTH,
		HEIGHT,
		LAYERS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		RENDERPASS = layout.offsetof(3);
		ATTACHMENTCOUNT = layout.offsetof(4);
		PATTACHMENTS = layout.offsetof(5);
		WIDTH = layout.offsetof(6);
		HEIGHT = layout.offsetof(7);
		LAYERS = layout.offsetof(8);
	}

	VkFramebufferCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkFramebufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkFramebufferCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code renderPass} field. */
	public long renderPass() { return nrenderPass(address()); }
	/** Returns the value of the {@code attachmentCount} field. */
	public int attachmentCount() { return nattachmentCount(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAttachments} field. */
	public LongBuffer pAttachments() { return npAttachments(address()); }
	/** Returns the value of the {@code width} field. */
	public int width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public int height() { return nheight(address()); }
	/** Returns the value of the {@code layers} field. */
	public int layers() { return nlayers(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkFramebufferCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkFramebufferCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkFramebufferCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code renderPass} field. */
	public VkFramebufferCreateInfo renderPass(long value) { nrenderPass(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
	public VkFramebufferCreateInfo pAttachments(LongBuffer value) { npAttachments(address(), value); return this; }
	/** Sets the specified value to the {@code width} field. */
	public VkFramebufferCreateInfo width(int value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public VkFramebufferCreateInfo height(int value) { nheight(address(), value); return this; }
	/** Sets the specified value to the {@code layers} field. */
	public VkFramebufferCreateInfo layers(int value) { nlayers(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkFramebufferCreateInfo set(
		int sType,
		long pNext,
		int flags,
		long renderPass,
		LongBuffer pAttachments,
		int width,
		int height,
		int layers
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		renderPass(renderPass);
		pAttachments(pAttachments);
		width(width);
		height(height);
		layers(layers);

		return this;
	}

	/** Unsafe version of {@link #set(VkFramebufferCreateInfo) set}. */
	public VkFramebufferCreateInfo nset(long struct) {
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
	public VkFramebufferCreateInfo set(VkFramebufferCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkFramebufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkFramebufferCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkFramebufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkFramebufferCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkFramebufferCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkFramebufferCreateInfo create() {
		return new VkFramebufferCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkFramebufferCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkFramebufferCreateInfo create(long address) {
		return address == NULL ? null : new VkFramebufferCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkFramebufferCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkFramebufferCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkFramebufferCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkFramebufferCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkFramebufferCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkFramebufferCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkFramebufferCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.FLAGS); }
	/** Unsafe version of {@link #renderPass}. */
	public static long nrenderPass(long struct) { return memGetLong(struct + VkFramebufferCreateInfo.RENDERPASS); }
	/** Unsafe version of {@link #attachmentCount}. */
	public static int nattachmentCount(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.ATTACHMENTCOUNT); }
	/** Unsafe version of {@link #pAttachments() pAttachments}. */
	public static LongBuffer npAttachments(long struct) { return memLongBuffer(memGetAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
	/** Unsafe version of {@link #width}. */
	public static int nwidth(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static int nheight(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.HEIGHT); }
	/** Unsafe version of {@link #layers}. */
	public static int nlayers(long struct) { return memGetInt(struct + VkFramebufferCreateInfo.LAYERS); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #renderPass(long) renderPass}. */
	public static void nrenderPass(long struct, long value) { memPutLong(struct + VkFramebufferCreateInfo.RENDERPASS, value); }
	/** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
	public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.ATTACHMENTCOUNT, value); }
	/** Unsafe version of {@link #pAttachments(LongBuffer) pAttachments}. */
	public static void npAttachments(long struct, LongBuffer value) { memPutAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
	/** Unsafe version of {@link #width(int) width}. */
	public static void nwidth(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.WIDTH, value); }
	/** Unsafe version of {@link #height(int) height}. */
	public static void nheight(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.HEIGHT, value); }
	/** Unsafe version of {@link #layers(int) layers}. */
	public static void nlayers(long struct, int value) { memPutInt(struct + VkFramebufferCreateInfo.LAYERS, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nattachmentCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS));
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

	/** An array of {@link VkFramebufferCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkFramebufferCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkFramebufferCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkFramebufferCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkFramebufferCreateInfo newInstance(long address) {
			return new VkFramebufferCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkFramebufferCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkFramebufferCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkFramebufferCreateInfo.nflags(address()); }
		/** Returns the value of the {@code renderPass} field. */
		public long renderPass() { return VkFramebufferCreateInfo.nrenderPass(address()); }
		/** Returns the value of the {@code attachmentCount} field. */
		public int attachmentCount() { return VkFramebufferCreateInfo.nattachmentCount(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAttachments} field. */
		public LongBuffer pAttachments() { return VkFramebufferCreateInfo.npAttachments(address()); }
		/** Returns the value of the {@code width} field. */
		public int width() { return VkFramebufferCreateInfo.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public int height() { return VkFramebufferCreateInfo.nheight(address()); }
		/** Returns the value of the {@code layers} field. */
		public int layers() { return VkFramebufferCreateInfo.nlayers(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkFramebufferCreateInfo.Buffer sType(int value) { VkFramebufferCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkFramebufferCreateInfo.Buffer pNext(long value) { VkFramebufferCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkFramebufferCreateInfo.Buffer flags(int value) { VkFramebufferCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code renderPass} field. */
		public VkFramebufferCreateInfo.Buffer renderPass(long value) { VkFramebufferCreateInfo.nrenderPass(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
		public VkFramebufferCreateInfo.Buffer pAttachments(LongBuffer value) { VkFramebufferCreateInfo.npAttachments(address(), value); return this; }
		/** Sets the specified value to the {@code width} field. */
		public VkFramebufferCreateInfo.Buffer width(int value) { VkFramebufferCreateInfo.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public VkFramebufferCreateInfo.Buffer height(int value) { VkFramebufferCreateInfo.nheight(address(), value); return this; }
		/** Sets the specified value to the {@code layers} field. */
		public VkFramebufferCreateInfo.Buffer layers(int value) { VkFramebufferCreateInfo.nlayers(address(), value); return this; }

	}

}