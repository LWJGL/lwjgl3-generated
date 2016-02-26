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
 * struct VkSubpassDescription {
 *     VkSubpassDescriptionFlags flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t inputAttachmentCount;
 *     const VkAttachmentReference * pInputAttachments;
 *     uint32_t colorAttachmentCount;
 *     const VkAttachmentReference * pColorAttachments;
 *     const VkAttachmentReference * pResolveAttachments;
 *     const VkAttachmentReference * pDepthStencilAttachment;
 *     uint32_t preserveAttachmentCount;
 *     const uint32_t * pPreserveAttachments;
 * }</code></pre>
 */
public class VkSubpassDescription extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		PIPELINEBINDPOINT,
		INPUTATTACHMENTCOUNT,
		PINPUTATTACHMENTS,
		COLORATTACHMENTCOUNT,
		PCOLORATTACHMENTS,
		PRESOLVEATTACHMENTS,
		PDEPTHSTENCILATTACHMENT,
		PRESERVEATTACHMENTCOUNT,
		PPRESERVEATTACHMENTS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		FLAGS = layout.offsetof(0);
		PIPELINEBINDPOINT = layout.offsetof(1);
		INPUTATTACHMENTCOUNT = layout.offsetof(2);
		PINPUTATTACHMENTS = layout.offsetof(3);
		COLORATTACHMENTCOUNT = layout.offsetof(4);
		PCOLORATTACHMENTS = layout.offsetof(5);
		PRESOLVEATTACHMENTS = layout.offsetof(6);
		PDEPTHSTENCILATTACHMENT = layout.offsetof(7);
		PRESERVEATTACHMENTCOUNT = layout.offsetof(8);
		PPRESERVEATTACHMENTS = layout.offsetof(9);
	}

	VkSubpassDescription(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSubpassDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSubpassDescription(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code pipelineBindPoint} field. */
	public int pipelineBindPoint() { return npipelineBindPoint(address()); }
	/** Returns the value of the {@code inputAttachmentCount} field. */
	public int inputAttachmentCount() { return ninputAttachmentCount(address()); }
	/** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
	public VkAttachmentReference.Buffer pInputAttachments() { return npInputAttachments(address()); }
	/** Returns the value of the {@code colorAttachmentCount} field. */
	public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
	/** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
	public VkAttachmentReference.Buffer pColorAttachments() { return npColorAttachments(address()); }
	/** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
	public VkAttachmentReference.Buffer pResolveAttachments() { return npResolveAttachments(address()); }
	/** Returns a {@link VkAttachmentReference} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
	public VkAttachmentReference pDepthStencilAttachment() { return npDepthStencilAttachment(address()); }
	/** Returns the value of the {@code preserveAttachmentCount} field. */
	public int preserveAttachmentCount() { return npreserveAttachmentCount(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
	public IntBuffer pPreserveAttachments() { return npPreserveAttachments(address()); }

	/** Sets the specified value to the {@code flags} field. */
	public VkSubpassDescription flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code pipelineBindPoint} field. */
	public VkSubpassDescription pipelineBindPoint(int value) { npipelineBindPoint(address(), value); return this; }
	/** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pInputAttachments} field. */
	public VkSubpassDescription pInputAttachments(VkAttachmentReference.Buffer value) { npInputAttachments(address(), value); return this; }
	/** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pColorAttachments} field. */
	public VkSubpassDescription pColorAttachments(VkAttachmentReference.Buffer value) { npColorAttachments(address(), value); return this; }
	/** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pResolveAttachments} field. */
	public VkSubpassDescription pResolveAttachments(VkAttachmentReference.Buffer value) { npResolveAttachments(address(), value); return this; }
	/** Sets the address of the specified {@link VkAttachmentReference} to the {@code pDepthStencilAttachment} field. */
	public VkSubpassDescription pDepthStencilAttachment(VkAttachmentReference value) { npDepthStencilAttachment(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
	public VkSubpassDescription pPreserveAttachments(IntBuffer value) { npPreserveAttachments(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSubpassDescription set(
		int flags,
		int pipelineBindPoint,
		VkAttachmentReference.Buffer pInputAttachments,
		VkAttachmentReference.Buffer pColorAttachments,
		VkAttachmentReference.Buffer pResolveAttachments,
		VkAttachmentReference pDepthStencilAttachment,
		IntBuffer pPreserveAttachments
	) {
		flags(flags);
		pipelineBindPoint(pipelineBindPoint);
		pInputAttachments(pInputAttachments);
		pColorAttachments(pColorAttachments);
		pResolveAttachments(pResolveAttachments);
		pDepthStencilAttachment(pDepthStencilAttachment);
		pPreserveAttachments(pPreserveAttachments);

		return this;
	}

	/** Unsafe version of {@link #set(VkSubpassDescription) set}. */
	public VkSubpassDescription nset(long struct) {
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
	public VkSubpassDescription set(VkSubpassDescription src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSubpassDescription} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkSubpassDescription malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSubpassDescription} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkSubpassDescription calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSubpassDescription} instance allocated with {@link BufferUtils}. */
	public static VkSubpassDescription create() {
		return new VkSubpassDescription(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSubpassDescription} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSubpassDescription create(long address) {
		return address == NULL ? null : new VkSubpassDescription(address, null);
	}

	/**
	 * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSubpassDescription.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkSubpassDescription.FLAGS); }
	/** Unsafe version of {@link #pipelineBindPoint}. */
	public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkSubpassDescription.PIPELINEBINDPOINT); }
	/** Unsafe version of {@link #inputAttachmentCount}. */
	public static int ninputAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.INPUTATTACHMENTCOUNT); }
	/** Unsafe version of {@link #pInputAttachments}. */
	public static VkAttachmentReference.Buffer npInputAttachments(long struct) { return VkAttachmentReference.create(memGetAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS), ninputAttachmentCount(struct)); }
	/** Unsafe version of {@link #colorAttachmentCount}. */
	public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.COLORATTACHMENTCOUNT); }
	/** Unsafe version of {@link #pColorAttachments}. */
	public static VkAttachmentReference.Buffer npColorAttachments(long struct) { return VkAttachmentReference.create(memGetAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
	/** Unsafe version of {@link #pResolveAttachments}. */
	public static VkAttachmentReference.Buffer npResolveAttachments(long struct) { return VkAttachmentReference.create(memGetAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct)); }
	/** Unsafe version of {@link #pDepthStencilAttachment}. */
	public static VkAttachmentReference npDepthStencilAttachment(long struct) { return VkAttachmentReference.create(memGetAddress(struct + VkSubpassDescription.PDEPTHSTENCILATTACHMENT)); }
	/** Unsafe version of {@link #preserveAttachmentCount}. */
	public static int npreserveAttachmentCount(long struct) { return memGetInt(struct + VkSubpassDescription.PRESERVEATTACHMENTCOUNT); }
	/** Unsafe version of {@link #pPreserveAttachments() pPreserveAttachments}. */
	public static IntBuffer npPreserveAttachments(long struct) { return memIntBuffer(memGetAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct)); }

	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkSubpassDescription.FLAGS, value); }
	/** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
	public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkSubpassDescription.PIPELINEBINDPOINT, value); }
	/** Sets the specified value to the {@code inputAttachmentCount} field of the specified {@code struct}. */
	public static void ninputAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.INPUTATTACHMENTCOUNT, value); }
	/** Unsafe version of {@link #pInputAttachments(VkAttachmentReference.Buffer) pInputAttachments}. */
	public static void npInputAttachments(long struct, VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS, addressSafe(value)); ninputAttachmentCount(struct, value == null ? 0 : value.remaining()); }
	/** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
	public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.COLORATTACHMENTCOUNT, value); }
	/** Unsafe version of {@link #pColorAttachments(VkAttachmentReference.Buffer) pColorAttachments}. */
	public static void npColorAttachments(long struct, VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS, addressSafe(value)); ncolorAttachmentCount(struct, value == null ? 0 : value.remaining()); }
	/** Unsafe version of {@link #pResolveAttachments(VkAttachmentReference.Buffer) pResolveAttachments}. */
	public static void npResolveAttachments(long struct, VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS, addressSafe(value)); ncolorAttachmentCount(struct, value == null ? 0 : value.remaining()); }
	/** Unsafe version of {@link #pDepthStencilAttachment(VkAttachmentReference) pDepthStencilAttachment}. */
	public static void npDepthStencilAttachment(long struct, VkAttachmentReference value) { memPutAddress(struct + VkSubpassDescription.PDEPTHSTENCILATTACHMENT, addressSafe(value)); }
	/** Sets the specified value to the {@code preserveAttachmentCount} field of the specified {@code struct}. */
	public static void npreserveAttachmentCount(long struct, int value) { memPutInt(struct + VkSubpassDescription.PRESERVEATTACHMENTCOUNT, value); }
	/** Unsafe version of {@link #pPreserveAttachments(IntBuffer) pPreserveAttachments}. */
	public static void npPreserveAttachments(long struct, IntBuffer value) { memPutAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS, memAddressSafe(value)); npreserveAttachmentCount(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( ninputAttachmentCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS));
		if ( ncolorAttachmentCount(struct) != 0 ) {
			checkPointer(memGetAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS));
			checkPointer(memGetAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS));
		}
		if ( npreserveAttachmentCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS));
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

	/** An array of {@link VkSubpassDescription} structs. */
	public static final class Buffer extends StructBuffer<VkSubpassDescription, Buffer> {

		/**
		 * Creates a new {@link VkSubpassDescription.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSubpassDescription#SIZEOF}, and its mark will be undefined.
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
		protected VkSubpassDescription newInstance(long address) {
			return new VkSubpassDescription(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkSubpassDescription.nflags(address()); }
		/** Returns the value of the {@code pipelineBindPoint} field. */
		public int pipelineBindPoint() { return VkSubpassDescription.npipelineBindPoint(address()); }
		/** Returns the value of the {@code inputAttachmentCount} field. */
		public int inputAttachmentCount() { return VkSubpassDescription.ninputAttachmentCount(address()); }
		/** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pInputAttachments} field. */
		public VkAttachmentReference.Buffer pInputAttachments() { return VkSubpassDescription.npInputAttachments(address()); }
		/** Returns the value of the {@code colorAttachmentCount} field. */
		public int colorAttachmentCount() { return VkSubpassDescription.ncolorAttachmentCount(address()); }
		/** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pColorAttachments} field. */
		public VkAttachmentReference.Buffer pColorAttachments() { return VkSubpassDescription.npColorAttachments(address()); }
		/** Returns a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@code pResolveAttachments} field. */
		public VkAttachmentReference.Buffer pResolveAttachments() { return VkSubpassDescription.npResolveAttachments(address()); }
		/** Returns a {@link VkAttachmentReference} view of the struct pointed to by the {@code pDepthStencilAttachment} field. */
		public VkAttachmentReference pDepthStencilAttachment() { return VkSubpassDescription.npDepthStencilAttachment(address()); }
		/** Returns the value of the {@code preserveAttachmentCount} field. */
		public int preserveAttachmentCount() { return VkSubpassDescription.npreserveAttachmentCount(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pPreserveAttachments} field. */
		public IntBuffer pPreserveAttachments() { return VkSubpassDescription.npPreserveAttachments(address()); }

		/** Sets the specified value to the {@code flags} field. */
		public VkSubpassDescription.Buffer flags(int value) { VkSubpassDescription.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code pipelineBindPoint} field. */
		public VkSubpassDescription.Buffer pipelineBindPoint(int value) { VkSubpassDescription.npipelineBindPoint(address(), value); return this; }
		/** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pInputAttachments} field. */
		public VkSubpassDescription.Buffer pInputAttachments(VkAttachmentReference.Buffer value) { VkSubpassDescription.npInputAttachments(address(), value); return this; }
		/** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pColorAttachments} field. */
		public VkSubpassDescription.Buffer pColorAttachments(VkAttachmentReference.Buffer value) { VkSubpassDescription.npColorAttachments(address(), value); return this; }
		/** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@code pResolveAttachments} field. */
		public VkSubpassDescription.Buffer pResolveAttachments(VkAttachmentReference.Buffer value) { VkSubpassDescription.npResolveAttachments(address(), value); return this; }
		/** Sets the address of the specified {@link VkAttachmentReference} to the {@code pDepthStencilAttachment} field. */
		public VkSubpassDescription.Buffer pDepthStencilAttachment(VkAttachmentReference value) { VkSubpassDescription.npDepthStencilAttachment(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pPreserveAttachments} field. */
		public VkSubpassDescription.Buffer pPreserveAttachments(IntBuffer value) { VkSubpassDescription.npPreserveAttachments(address(), value); return this; }

	}

}