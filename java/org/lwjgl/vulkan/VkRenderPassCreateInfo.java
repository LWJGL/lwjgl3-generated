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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkRenderPassCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkRenderPassCreateFlags flags;
 *     uint32_t attachmentCount;
 *     const VkAttachmentDescription * pAttachments;
 *     uint32_t subpassCount;
 *     const VkSubpassDescription * pSubpasses;
 *     uint32_t dependencyCount;
 *     const VkSubpassDependency * pDependencies;
 * }</code></pre>
 */
public class VkRenderPassCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

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
	/** Returns a {@link VkAttachmentDescription} view of the struct pointed to by the {@code pAttachments} field. */
	public VkAttachmentDescription pAttachments() { return npAttachments(address()); }
	/** Returns the value of the {@code subpassCount} field. */
	public int subpassCount() { return nsubpassCount(address()); }
	/** Returns a {@link VkSubpassDescription} view of the struct pointed to by the {@code pSubpasses} field. */
	public VkSubpassDescription pSubpasses() { return npSubpasses(address()); }
	/** Returns the value of the {@code dependencyCount} field. */
	public int dependencyCount() { return ndependencyCount(address()); }
	/** Returns a {@link VkSubpassDependency} view of the struct pointed to by the {@code pDependencies} field. */
	public VkSubpassDependency pDependencies() { return npDependencies(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkRenderPassCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkRenderPassCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkRenderPassCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code attachmentCount} field. */
	public VkRenderPassCreateInfo attachmentCount(int value) { nattachmentCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkAttachmentDescription} to the {@code pAttachments} field. */
	public VkRenderPassCreateInfo pAttachments(VkAttachmentDescription value) { npAttachments(address(), value); return this; }
	/** Sets the specified value to the {@code subpassCount} field. */
	public VkRenderPassCreateInfo subpassCount(int value) { nsubpassCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkSubpassDescription} to the {@code pSubpasses} field. */
	public VkRenderPassCreateInfo pSubpasses(VkSubpassDescription value) { npSubpasses(address(), value); return this; }
	/** Sets the specified value to the {@code dependencyCount} field. */
	public VkRenderPassCreateInfo dependencyCount(int value) { ndependencyCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkSubpassDependency} to the {@code pDependencies} field. */
	public VkRenderPassCreateInfo pDependencies(VkSubpassDependency value) { npDependencies(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkRenderPassCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int attachmentCount,
		VkAttachmentDescription pAttachments,
		int subpassCount,
		VkSubpassDescription pSubpasses,
		int dependencyCount,
		VkSubpassDependency pDependencies
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		attachmentCount(attachmentCount);
		pAttachments(pAttachments);
		subpassCount(subpassCount);
		pSubpasses(pSubpasses);
		dependencyCount(dependencyCount);
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

	/** {@link ByteBuffer} version of {@link #set(VkRenderPassCreateInfo) set}. */
	public VkRenderPassCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkRenderPassCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkRenderPassCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkRenderPassCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
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

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.FLAGS); }
	/** Unsafe version of {@link #attachmentCount}. */
	public static int nattachmentCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT); }
	/** Unsafe version of {@link #pAttachments}. */
	public static VkAttachmentDescription npAttachments(long struct) { return VkAttachmentDescription.create(memGetAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS)); }
	/** Unsafe version of {@link #subpassCount}. */
	public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.SUBPASSCOUNT); }
	/** Unsafe version of {@link #pSubpasses}. */
	public static VkSubpassDescription npSubpasses(long struct) { return VkSubpassDescription.create(memGetAddress(struct + VkRenderPassCreateInfo.PSUBPASSES)); }
	/** Unsafe version of {@link #dependencyCount}. */
	public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT); }
	/** Unsafe version of {@link #pDependencies}. */
	public static VkSubpassDependency npDependencies(long struct) { return VkSubpassDependency.create(memGetAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #attachmentCount(int) attachmentCount}. */
	public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.ATTACHMENTCOUNT, value); }
	/** Unsafe version of {@link #pAttachments(VkAttachmentDescription) pAttachments}. */
	public static void npAttachments(long struct, VkAttachmentDescription value) { memPutAddress(struct + VkRenderPassCreateInfo.PATTACHMENTS, value.address()); }
	/** Unsafe version of {@link #subpassCount(int) subpassCount}. */
	public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.SUBPASSCOUNT, value); }
	/** Unsafe version of {@link #pSubpasses(VkSubpassDescription) pSubpasses}. */
	public static void npSubpasses(long struct, VkSubpassDescription value) { memPutAddress(struct + VkRenderPassCreateInfo.PSUBPASSES, value.address()); }
	/** Unsafe version of {@link #dependencyCount(int) dependencyCount}. */
	public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo.DEPENDENCYCOUNT, value); }
	/** Unsafe version of {@link #pDependencies(VkSubpassDependency) pDependencies}. */
	public static void npDependencies(long struct, VkSubpassDependency value) { memPutAddress(struct + VkRenderPassCreateInfo.PDEPENDENCIES, value.address()); }

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
			return new VkRenderPassCreateInfo(address, container);
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
		/** Returns a {@link VkAttachmentDescription} view of the struct pointed to by the {@code pAttachments} field. */
		public VkAttachmentDescription pAttachments() { return VkRenderPassCreateInfo.npAttachments(address()); }
		/** Returns the value of the {@code subpassCount} field. */
		public int subpassCount() { return VkRenderPassCreateInfo.nsubpassCount(address()); }
		/** Returns a {@link VkSubpassDescription} view of the struct pointed to by the {@code pSubpasses} field. */
		public VkSubpassDescription pSubpasses() { return VkRenderPassCreateInfo.npSubpasses(address()); }
		/** Returns the value of the {@code dependencyCount} field. */
		public int dependencyCount() { return VkRenderPassCreateInfo.ndependencyCount(address()); }
		/** Returns a {@link VkSubpassDependency} view of the struct pointed to by the {@code pDependencies} field. */
		public VkSubpassDependency pDependencies() { return VkRenderPassCreateInfo.npDependencies(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkRenderPassCreateInfo.Buffer sType(int value) { VkRenderPassCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkRenderPassCreateInfo.Buffer pNext(long value) { VkRenderPassCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkRenderPassCreateInfo.Buffer flags(int value) { VkRenderPassCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code attachmentCount} field. */
		public VkRenderPassCreateInfo.Buffer attachmentCount(int value) { VkRenderPassCreateInfo.nattachmentCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkAttachmentDescription} to the {@code pAttachments} field. */
		public VkRenderPassCreateInfo.Buffer pAttachments(VkAttachmentDescription value) { VkRenderPassCreateInfo.npAttachments(address(), value); return this; }
		/** Sets the specified value to the {@code subpassCount} field. */
		public VkRenderPassCreateInfo.Buffer subpassCount(int value) { VkRenderPassCreateInfo.nsubpassCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkSubpassDescription} to the {@code pSubpasses} field. */
		public VkRenderPassCreateInfo.Buffer pSubpasses(VkSubpassDescription value) { VkRenderPassCreateInfo.npSubpasses(address(), value); return this; }
		/** Sets the specified value to the {@code dependencyCount} field. */
		public VkRenderPassCreateInfo.Buffer dependencyCount(int value) { VkRenderPassCreateInfo.ndependencyCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkSubpassDependency} to the {@code pDependencies} field. */
		public VkRenderPassCreateInfo.Buffer pDependencies(VkSubpassDependency value) { VkRenderPassCreateInfo.npDependencies(address(), value); return this; }

	}

}