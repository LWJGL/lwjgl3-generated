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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkRenderPassCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkRenderPassCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a render pass should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a pointer to an array of {@code attachmentCount} valid {@link VkAttachmentDescription}
 * structures</li>
 * <li>{@code pSubpasses} <b>must</b> be a pointer to an array of {@code subpassCount} valid {@link VkSubpassDescription} structures</li>
 * <li>If {@code dependencyCount} is not 0, {@code pDependencies} <b>must</b> be a pointer to an array of {@code dependencyCount} valid {@link VkSubpassDependency}
 * structures</li>
 * <li>{@code subpassCount} <b>must</b> be greater than 0</li>
 * <li>If any two subpasses operate on attachments with overlapping ranges of the same {@code VkDeviceMemory} object, and at least one subpass writes to
 * that area of {@code VkDeviceMemory}, a subpass dependency <b>must</b> be included (either directly or via some intermediate subpasses) between them</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or
 * {@code pDepthStencilAttachment}, or the attachment indexed by any element of {@code pPreserveAttachments} in any given element of
 * {@code pSubpasses} is bound to a range of a {@code VkDeviceMemory} object that overlaps with any other attachment in any subpass (including the
 * same subpass), the {@link VkAttachmentDescription} structures describing them <b>must</b> include {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} in {@code flags}</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or
 * {@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any given element of {@code pSubpasses} is not
 * {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, it <b>must</b> be less than {@code attachmentCount}</li>
 * <li>The value of any element of the {@code pPreserveAttachments} member in any given element of {@code pSubpasses} <b>must not</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code attachmentCount} &ndash; the number of attachments used by this render pass, or zero indicating no attachments</li>
 * <li>{@code pAttachments} &ndash; 
 * points to an array of {@code attachmentCount} number of {@link VkAttachmentDescription} structures describing properties of the attachments, or {@code NULL} if
 * {@code attachmentCount} is zero</li>
 * <li>{@code subpassCount} &ndash; the number of subpasses to create for this render pass</li>
 * <li>{@code pSubpasses} &ndash; points to an array of {@code subpassCount} number of {@link VkSubpassDescription} structures describing properties of the subpasses</li>
 * <li>{@code dependencyCount} &ndash; the number of dependencies between pairs of subpasses, or zero indicating no dependencies</li>
 * <li>{@code pDependencies} &ndash; 
 * points to an array of {@code dependencyCount} number of {@link VkSubpassDependency} structures describing dependencies between pairs of subpasses, or {@code NULL}
 * if {@code dependencyCount} is zero</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkRenderPassCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkRenderPassCreateFlags flags;
    uint32_t attachmentCount;
    const VkAttachmentDescription * pAttachments;
    uint32_t subpassCount;
    const VkSubpassDescription * pSubpasses;
    uint32_t dependencyCount;
    const VkSubpassDependency * pDependencies;
}</code></pre>
 */
public class VkRenderPassCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		ATTACHMENTCOUNT,
		PATTACHMENTS,
		SUBPASSCOUNT,
		PSUBPASSES,
		DEPENDENCYCOUNT,
		PDEPENDENCIES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		ATTACHMENTCOUNT = layout.offsetof(3);
		PATTACHMENTS = layout.offsetof(4);
		SUBPASSCOUNT = layout.offsetof(5);
		PSUBPASSES = layout.offsetof(6);
		DEPENDENCYCOUNT = layout.offsetof(7);
		PDEPENDENCIES = layout.offsetof(8);
	}

	VkRenderPassCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkRenderPassCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkRenderPassCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code attachmentCount} field. */
	public int attachmentCount() { return nattachmentCount(address()); }
	/** Returns a {@link VkAttachmentDescription.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
	public VkAttachmentDescription.Buffer pAttachments() { return npAttachments(address()); }
	/** Returns the value of the {@code subpassCount} field. */
	public int subpassCount() { return nsubpassCount(address()); }
	/** Returns a {@link VkSubpassDescription.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
	public VkSubpassDescription.Buffer pSubpasses() { return npSubpasses(address()); }
	/** Returns the value of the {@code dependencyCount} field. */
	public int dependencyCount() { return ndependencyCount(address()); }
	/** Returns a {@link VkSubpassDependency.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
	public VkSubpassDependency.Buffer pDependencies() { return npDependencies(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkRenderPassCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkRenderPassCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkRenderPassCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link VkAttachmentDescription.Buffer} to the {@code pAttachments} field. */
	public VkRenderPassCreateInfo pAttachments(VkAttachmentDescription.Buffer value) { npAttachments(address(), value); return this; }
	/** Sets the address of the specified {@link VkSubpassDescription.Buffer} to the {@code pSubpasses} field. */
	public VkRenderPassCreateInfo pSubpasses(VkSubpassDescription.Buffer value) { npSubpasses(address(), value); return this; }
	/** Sets the address of the specified {@link VkSubpassDependency.Buffer} to the {@code pDependencies} field. */
	public VkRenderPassCreateInfo pDependencies(VkSubpassDependency.Buffer value) { npDependencies(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkRenderPassCreateInfo set(
		int sType,
		long pNext,
		int flags,
		VkAttachmentDescription.Buffer pAttachments,
		VkSubpassDescription.Buffer pSubpasses,
		VkSubpassDependency.Buffer pDependencies
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pAttachments(pAttachments);
		pSubpasses(pSubpasses);
		pDependencies(pDependencies);

		return this;
	}

	/** Unsafe version of {@link #set(VkRenderPassCreateInfo) set}. */
	public VkRenderPassCreateInfo nset(long struct) {
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
	public VkRenderPassCreateInfo set(VkRenderPassCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkRenderPassCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkRenderPassCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkRenderPassCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkRenderPassCreateInfo create() {
		return new VkRenderPassCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkRenderPassCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkRenderPassCreateInfo create(long address) {
		return address == NULL ? null : new VkRenderPassCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkRenderPassCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkRenderPassCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkRenderPassCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkRenderPassCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkRenderPassCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkRenderPassCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkRenderPassCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.FLAGS); }
	/** Unsafe version of {@link #attachmentCount}. */
	public static int nattachmentCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT); }
	/** Unsafe version of {@link #pAttachments}. */
	public static VkAttachmentDescription.Buffer npAttachments(long struct) { return VkAttachmentDescription.create(memGetAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
	/** Unsafe version of {@link #subpassCount}. */
	public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.SUBPASSCOUNT); }
	/** Unsafe version of {@link #pSubpasses}. */
	public static VkSubpassDescription.Buffer npSubpasses(long struct) { return VkSubpassDescription.create(memGetAddress(struct + VkRenderPassCreateInfo.PSUBPASSES), nsubpassCount(struct)); }
	/** Unsafe version of {@link #dependencyCount}. */
	public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT); }
	/** Unsafe version of {@link #pDependencies}. */
	public static VkSubpassDependency.Buffer npDependencies(long struct) { return VkSubpassDependency.create(memGetAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES), ndependencyCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.FLAGS, value); }
	/** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
	public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT, value); }
	/** Unsafe version of {@link #pAttachments(VkAttachmentDescription.Buffer) pAttachments}. */
	public static void npAttachments(long struct, VkAttachmentDescription.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS, addressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
	/** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
	public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.SUBPASSCOUNT, value); }
	/** Unsafe version of {@link #pSubpasses(VkSubpassDescription.Buffer) pSubpasses}. */
	public static void npSubpasses(long struct, VkSubpassDescription.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PSUBPASSES, value.address()); nsubpassCount(struct, value.remaining()); }
	/** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
	public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT, value); }
	/** Unsafe version of {@link #pDependencies(VkSubpassDependency.Buffer) pDependencies}. */
	public static void npDependencies(long struct, VkSubpassDependency.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES, addressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nattachmentCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS));
		int subpassCount = nsubpassCount(struct);
		long pSubpasses = memGetAddress(struct + VkRenderPassCreateInfo.PSUBPASSES);
		checkPointer(pSubpasses);
		VkSubpassDescription.validate(pSubpasses, subpassCount);
		if ( ndependencyCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES));
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

	/** An array of {@link VkRenderPassCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkRenderPassCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkRenderPassCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkRenderPassCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkRenderPassCreateInfo newInstance(long address) {
			return new VkRenderPassCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkRenderPassCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkRenderPassCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkRenderPassCreateInfo.nflags(address()); }
		/** Returns the value of the {@code attachmentCount} field. */
		public int attachmentCount() { return VkRenderPassCreateInfo.nattachmentCount(address()); }
		/** Returns a {@link VkAttachmentDescription.Buffer} view of the struct array pointed to by the {@code pAttachments} field. */
		public VkAttachmentDescription.Buffer pAttachments() { return VkRenderPassCreateInfo.npAttachments(address()); }
		/** Returns the value of the {@code subpassCount} field. */
		public int subpassCount() { return VkRenderPassCreateInfo.nsubpassCount(address()); }
		/** Returns a {@link VkSubpassDescription.Buffer} view of the struct array pointed to by the {@code pSubpasses} field. */
		public VkSubpassDescription.Buffer pSubpasses() { return VkRenderPassCreateInfo.npSubpasses(address()); }
		/** Returns the value of the {@code dependencyCount} field. */
		public int dependencyCount() { return VkRenderPassCreateInfo.ndependencyCount(address()); }
		/** Returns a {@link VkSubpassDependency.Buffer} view of the struct array pointed to by the {@code pDependencies} field. */
		public VkSubpassDependency.Buffer pDependencies() { return VkRenderPassCreateInfo.npDependencies(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkRenderPassCreateInfo.Buffer sType(int value) { VkRenderPassCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkRenderPassCreateInfo.Buffer pNext(long value) { VkRenderPassCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkRenderPassCreateInfo.Buffer flags(int value) { VkRenderPassCreateInfo.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link VkAttachmentDescription.Buffer} to the {@code pAttachments} field. */
		public VkRenderPassCreateInfo.Buffer pAttachments(VkAttachmentDescription.Buffer value) { VkRenderPassCreateInfo.npAttachments(address(), value); return this; }
		/** Sets the address of the specified {@link VkSubpassDescription.Buffer} to the {@code pSubpasses} field. */
		public VkRenderPassCreateInfo.Buffer pSubpasses(VkSubpassDescription.Buffer value) { VkRenderPassCreateInfo.npSubpasses(address(), value); return this; }
		/** Sets the address of the specified {@link VkSubpassDependency.Buffer} to the {@code pDependencies} field. */
		public VkRenderPassCreateInfo.Buffer pDependencies(VkSubpassDependency.Buffer value) { VkRenderPassCreateInfo.npDependencies(address(), value); return this; }

	}

}