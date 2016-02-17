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
 * struct VkDisplayPlaneCapabilitiesKHR {
 *     VkDisplayPlaneAlphaFlagsKHR supportedAlpha;
 *     {@link VkOffset2D VkOffset2D} minSrcPosition;
 *     {@link VkOffset2D VkOffset2D} maxSrcPosition;
 *     {@link VkExtent2D VkExtent2D} minSrcExtent;
 *     {@link VkExtent2D VkExtent2D} maxSrcExtent;
 *     {@link VkOffset2D VkOffset2D} minDstPosition;
 *     {@link VkOffset2D VkOffset2D} maxDstPosition;
 *     {@link VkExtent2D VkExtent2D} minDstExtent;
 *     {@link VkExtent2D VkExtent2D} maxDstExtent;
 * }</code></pre>
 */
public class VkDisplayPlaneCapabilitiesKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		SUPPORTEDALPHA,
		MINSRCPOSITION,
		MAXSRCPOSITION,
		MINSRCEXTENT,
		MAXSRCEXTENT,
		MINDSTPOSITION,
		MAXDSTPOSITION,
		MINDSTEXTENT,
		MAXDSTEXTENT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(VkOffset2D.SIZEOF, VkOffset2D.__ALIGNMENT),
			__member(VkOffset2D.SIZEOF, VkOffset2D.__ALIGNMENT),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT),
			__member(VkOffset2D.SIZEOF, VkOffset2D.__ALIGNMENT),
			__member(VkOffset2D.SIZEOF, VkOffset2D.__ALIGNMENT),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT),
			__member(VkExtent2D.SIZEOF, VkExtent2D.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		SUPPORTEDALPHA = layout.offsetof(0);
		MINSRCPOSITION = layout.offsetof(1);
		MAXSRCPOSITION = layout.offsetof(2);
		MINSRCEXTENT = layout.offsetof(3);
		MAXSRCEXTENT = layout.offsetof(4);
		MINDSTPOSITION = layout.offsetof(5);
		MAXDSTPOSITION = layout.offsetof(6);
		MINDSTEXTENT = layout.offsetof(7);
		MAXDSTEXTENT = layout.offsetof(8);
	}

	VkDisplayPlaneCapabilitiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayPlaneCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayPlaneCapabilitiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code supportedAlpha} field. */
	public int supportedAlpha() { return nsupportedAlpha(address()); }
	/** Returns a {@link VkOffset2D} view of the {@code minSrcPosition} field. */
	public VkOffset2D minSrcPosition() { return nminSrcPosition(address()); }
	/** Returns a {@link VkOffset2D} view of the {@code maxSrcPosition} field. */
	public VkOffset2D maxSrcPosition() { return nmaxSrcPosition(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code minSrcExtent} field. */
	public VkExtent2D minSrcExtent() { return nminSrcExtent(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code maxSrcExtent} field. */
	public VkExtent2D maxSrcExtent() { return nmaxSrcExtent(address()); }
	/** Returns a {@link VkOffset2D} view of the {@code minDstPosition} field. */
	public VkOffset2D minDstPosition() { return nminDstPosition(address()); }
	/** Returns a {@link VkOffset2D} view of the {@code maxDstPosition} field. */
	public VkOffset2D maxDstPosition() { return nmaxDstPosition(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code minDstExtent} field. */
	public VkExtent2D minDstExtent() { return nminDstExtent(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code maxDstExtent} field. */
	public VkExtent2D maxDstExtent() { return nmaxDstExtent(address()); }

	/** Sets the specified value to the {@code supportedAlpha} field. */
	public VkDisplayPlaneCapabilitiesKHR supportedAlpha(int value) { nsupportedAlpha(address(), value); return this; }
	/** Copies the specified {@link VkOffset2D} to the {@code minSrcPosition} field. */
	public VkDisplayPlaneCapabilitiesKHR minSrcPosition(VkOffset2D value) { nminSrcPosition(address(), value); return this; }
	/** Copies the specified {@link VkOffset2D} to the {@code maxSrcPosition} field. */
	public VkDisplayPlaneCapabilitiesKHR maxSrcPosition(VkOffset2D value) { nmaxSrcPosition(address(), value); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code minSrcExtent} field. */
	public VkDisplayPlaneCapabilitiesKHR minSrcExtent(VkExtent2D value) { nminSrcExtent(address(), value); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code maxSrcExtent} field. */
	public VkDisplayPlaneCapabilitiesKHR maxSrcExtent(VkExtent2D value) { nmaxSrcExtent(address(), value); return this; }
	/** Copies the specified {@link VkOffset2D} to the {@code minDstPosition} field. */
	public VkDisplayPlaneCapabilitiesKHR minDstPosition(VkOffset2D value) { nminDstPosition(address(), value); return this; }
	/** Copies the specified {@link VkOffset2D} to the {@code maxDstPosition} field. */
	public VkDisplayPlaneCapabilitiesKHR maxDstPosition(VkOffset2D value) { nmaxDstPosition(address(), value); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code minDstExtent} field. */
	public VkDisplayPlaneCapabilitiesKHR minDstExtent(VkExtent2D value) { nminDstExtent(address(), value); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code maxDstExtent} field. */
	public VkDisplayPlaneCapabilitiesKHR maxDstExtent(VkExtent2D value) { nmaxDstExtent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDisplayPlaneCapabilitiesKHR set(
		int supportedAlpha,
		VkOffset2D minSrcPosition,
		VkOffset2D maxSrcPosition,
		VkExtent2D minSrcExtent,
		VkExtent2D maxSrcExtent,
		VkOffset2D minDstPosition,
		VkOffset2D maxDstPosition,
		VkExtent2D minDstExtent,
		VkExtent2D maxDstExtent
	) {
		supportedAlpha(supportedAlpha);
		minSrcPosition(minSrcPosition);
		maxSrcPosition(maxSrcPosition);
		minSrcExtent(minSrcExtent);
		maxSrcExtent(maxSrcExtent);
		minDstPosition(minDstPosition);
		maxDstPosition(maxDstPosition);
		minDstExtent(minDstExtent);
		maxDstExtent(maxDstExtent);

		return this;
	}

	/** Unsafe version of {@link #set(VkDisplayPlaneCapabilitiesKHR) set}. */
	public VkDisplayPlaneCapabilitiesKHR nset(long struct) {
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
	public VkDisplayPlaneCapabilitiesKHR set(VkDisplayPlaneCapabilitiesKHR src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkDisplayPlaneCapabilitiesKHR) set}. */
	public VkDisplayPlaneCapabilitiesKHR set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayPlaneCapabilitiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayPlaneCapabilitiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayPlaneCapabilitiesKHR create() {
		return new VkDisplayPlaneCapabilitiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayPlaneCapabilitiesKHR create(long address) {
		return address == NULL ? null : new VkDisplayPlaneCapabilitiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #supportedAlpha}. */
	public static int nsupportedAlpha(long struct) { return memGetInt(struct + VkDisplayPlaneCapabilitiesKHR.SUPPORTEDALPHA); }
	/** Unsafe version of {@link #minSrcPosition}. */
	public static VkOffset2D nminSrcPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINSRCPOSITION); }
	/** Unsafe version of {@link #maxSrcPosition}. */
	public static VkOffset2D nmaxSrcPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXSRCPOSITION); }
	/** Unsafe version of {@link #minSrcExtent}. */
	public static VkExtent2D nminSrcExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINSRCEXTENT); }
	/** Unsafe version of {@link #maxSrcExtent}. */
	public static VkExtent2D nmaxSrcExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXSRCEXTENT); }
	/** Unsafe version of {@link #minDstPosition}. */
	public static VkOffset2D nminDstPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINDSTPOSITION); }
	/** Unsafe version of {@link #maxDstPosition}. */
	public static VkOffset2D nmaxDstPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXDSTPOSITION); }
	/** Unsafe version of {@link #minDstExtent}. */
	public static VkExtent2D nminDstExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINDSTEXTENT); }
	/** Unsafe version of {@link #maxDstExtent}. */
	public static VkExtent2D nmaxDstExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXDSTEXTENT); }

	/** Unsafe version of {@link #supportedAlpha(int) supportedAlpha}. */
	public static void nsupportedAlpha(long struct, int value) { memPutInt(struct + VkDisplayPlaneCapabilitiesKHR.SUPPORTEDALPHA, value); }
	/** Unsafe version of {@link #minSrcPosition(VkOffset2D) minSrcPosition}. */
	public static void nminSrcPosition(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkDisplayPlaneCapabilitiesKHR.MINSRCPOSITION, VkOffset2D.SIZEOF); }
	/** Unsafe version of {@link #maxSrcPosition(VkOffset2D) maxSrcPosition}. */
	public static void nmaxSrcPosition(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkDisplayPlaneCapabilitiesKHR.MAXSRCPOSITION, VkOffset2D.SIZEOF); }
	/** Unsafe version of {@link #minSrcExtent(VkExtent2D) minSrcExtent}. */
	public static void nminSrcExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplayPlaneCapabilitiesKHR.MINSRCEXTENT, VkExtent2D.SIZEOF); }
	/** Unsafe version of {@link #maxSrcExtent(VkExtent2D) maxSrcExtent}. */
	public static void nmaxSrcExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplayPlaneCapabilitiesKHR.MAXSRCEXTENT, VkExtent2D.SIZEOF); }
	/** Unsafe version of {@link #minDstPosition(VkOffset2D) minDstPosition}. */
	public static void nminDstPosition(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkDisplayPlaneCapabilitiesKHR.MINDSTPOSITION, VkOffset2D.SIZEOF); }
	/** Unsafe version of {@link #maxDstPosition(VkOffset2D) maxDstPosition}. */
	public static void nmaxDstPosition(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkDisplayPlaneCapabilitiesKHR.MAXDSTPOSITION, VkOffset2D.SIZEOF); }
	/** Unsafe version of {@link #minDstExtent(VkExtent2D) minDstExtent}. */
	public static void nminDstExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplayPlaneCapabilitiesKHR.MINDSTEXTENT, VkExtent2D.SIZEOF); }
	/** Unsafe version of {@link #maxDstExtent(VkExtent2D) maxDstExtent}. */
	public static void nmaxDstExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplayPlaneCapabilitiesKHR.MAXDSTEXTENT, VkExtent2D.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkDisplayPlaneCapabilitiesKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayPlaneCapabilitiesKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayPlaneCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayPlaneCapabilitiesKHR newInstance(long address) {
			return new VkDisplayPlaneCapabilitiesKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code supportedAlpha} field. */
		public int supportedAlpha() { return VkDisplayPlaneCapabilitiesKHR.nsupportedAlpha(address()); }
		/** Returns a {@link VkOffset2D} view of the {@code minSrcPosition} field. */
		public VkOffset2D minSrcPosition() { return VkDisplayPlaneCapabilitiesKHR.nminSrcPosition(address()); }
		/** Returns a {@link VkOffset2D} view of the {@code maxSrcPosition} field. */
		public VkOffset2D maxSrcPosition() { return VkDisplayPlaneCapabilitiesKHR.nmaxSrcPosition(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code minSrcExtent} field. */
		public VkExtent2D minSrcExtent() { return VkDisplayPlaneCapabilitiesKHR.nminSrcExtent(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code maxSrcExtent} field. */
		public VkExtent2D maxSrcExtent() { return VkDisplayPlaneCapabilitiesKHR.nmaxSrcExtent(address()); }
		/** Returns a {@link VkOffset2D} view of the {@code minDstPosition} field. */
		public VkOffset2D minDstPosition() { return VkDisplayPlaneCapabilitiesKHR.nminDstPosition(address()); }
		/** Returns a {@link VkOffset2D} view of the {@code maxDstPosition} field. */
		public VkOffset2D maxDstPosition() { return VkDisplayPlaneCapabilitiesKHR.nmaxDstPosition(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code minDstExtent} field. */
		public VkExtent2D minDstExtent() { return VkDisplayPlaneCapabilitiesKHR.nminDstExtent(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code maxDstExtent} field. */
		public VkExtent2D maxDstExtent() { return VkDisplayPlaneCapabilitiesKHR.nmaxDstExtent(address()); }

		/** Sets the specified value to the {@code supportedAlpha} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer supportedAlpha(int value) { VkDisplayPlaneCapabilitiesKHR.nsupportedAlpha(address(), value); return this; }
		/** Copies the specified {@link VkOffset2D} to the {@code minSrcPosition} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer minSrcPosition(VkOffset2D value) { VkDisplayPlaneCapabilitiesKHR.nminSrcPosition(address(), value); return this; }
		/** Copies the specified {@link VkOffset2D} to the {@code maxSrcPosition} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer maxSrcPosition(VkOffset2D value) { VkDisplayPlaneCapabilitiesKHR.nmaxSrcPosition(address(), value); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code minSrcExtent} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer minSrcExtent(VkExtent2D value) { VkDisplayPlaneCapabilitiesKHR.nminSrcExtent(address(), value); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code maxSrcExtent} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer maxSrcExtent(VkExtent2D value) { VkDisplayPlaneCapabilitiesKHR.nmaxSrcExtent(address(), value); return this; }
		/** Copies the specified {@link VkOffset2D} to the {@code minDstPosition} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer minDstPosition(VkOffset2D value) { VkDisplayPlaneCapabilitiesKHR.nminDstPosition(address(), value); return this; }
		/** Copies the specified {@link VkOffset2D} to the {@code maxDstPosition} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer maxDstPosition(VkOffset2D value) { VkDisplayPlaneCapabilitiesKHR.nmaxDstPosition(address(), value); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code minDstExtent} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer minDstExtent(VkExtent2D value) { VkDisplayPlaneCapabilitiesKHR.nminDstExtent(address(), value); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code maxDstExtent} field. */
		public VkDisplayPlaneCapabilitiesKHR.Buffer maxDstExtent(VkExtent2D value) { VkDisplayPlaneCapabilitiesKHR.nmaxDstExtent(address(), value); return this; }

	}

}