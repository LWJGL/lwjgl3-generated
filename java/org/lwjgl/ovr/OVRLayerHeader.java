/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Defines properties shared by all ovrLayer structs, such as {@link OVRLayerEyeFov}.
 * 
 * <h3>ovrLayerHeader members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Type</td><td class="nw">ovrLayerType</td><td>described by {@code ovrLayerType}</td></tr>
 * <tr><td>Flags</td><td class="nw">unsigned int</td><td>described by {@code ovrLayerFlags}</td></tr>
 * </table>
 */
public class OVRLayerHeader extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		TYPE,
		FLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		TYPE = layout.offsetof(0);
		FLAGS = layout.offsetof(1);
	}

	OVRLayerHeader(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRLayerHeader} instance at the specified memory address. */
	public OVRLayerHeader(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRLayerHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerHeader(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code Type} field. */
	public int Type() { return nType(address()); }
	/** Returns the value of the {@code Flags} field. */
	public int Flags() { return nFlags(address()); }

	/** Sets the specified value to the {@code Type} field. */
	public OVRLayerHeader Type(int value) { nType(address(), value); return this; }
	/** Sets the specified value to the {@code Flags} field. */
	public OVRLayerHeader Flags(int value) { nFlags(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerHeader set(
		int Type,
		int Flags
	) {
		Type(Type);
		Flags(Flags);

		return this;
	}

	/** Unsafe version of {@link #set(OVRLayerHeader) set}. */
	public OVRLayerHeader nset(long struct) {
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
	public OVRLayerHeader set(OVRLayerHeader src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRLayerHeader) set}. */
	public OVRLayerHeader set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerHeader malloc() {
		return new OVRLayerHeader(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerHeader calloc() {
		return new OVRLayerHeader(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link BufferUtils}. */
	public static OVRLayerHeader create() {
		return new OVRLayerHeader(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRLayerHeader.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Type}. */
	public static int nType(long struct) { return memGetInt(struct + OVRLayerHeader.TYPE); }
	/** Unsafe version of {@link #Flags}. */
	public static int nFlags(long struct) { return memGetInt(struct + OVRLayerHeader.FLAGS); }

	/** Unsafe version of {@link #Type(int) Type}. */
	public static void nType(long struct, int value) { memPutInt(struct + OVRLayerHeader.TYPE, value); }
	/** Unsafe version of {@link #Flags(int) Flags}. */
	public static void nFlags(long struct, int value) { memPutInt(struct + OVRLayerHeader.FLAGS, value); }

	// -----------------------------------

	/** An array of {@link OVRLayerHeader} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerHeader, Buffer> {

		/**
		 * Creates a new {@link OVRLayerHeader.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerHeader#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVRLayerHeader newInstance(long address) {
			return new OVRLayerHeader(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Type} field. */
		public int Type() { return nType(address()); }
		/** Returns the value of the {@code Flags} field. */
		public int Flags() { return nFlags(address()); }

		/** Sets the specified value to the {@code Type} field. */
		public OVRLayerHeader.Buffer Type(int value) { nType(address(), value); return this; }
		/** Sets the specified value to the {@code Flags} field. */
		public OVRLayerHeader.Buffer Flags(int value) { nFlags(address(), value); return this; }

	}

}