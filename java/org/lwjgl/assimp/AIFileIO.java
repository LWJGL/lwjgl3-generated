/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provided are functions to open and close files. Supply a custom structure to the import function. If you don't, a default implementation is used. Use
 * custom file systems to enable reading from other sources, such as ZIPs or memory locations.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code OpenProc} &ndash; Function used to open a new file</li>
 * <li>{@code CloseProc} &ndash; Function used to close an existing file</li>
 * <li>{@code UserData} &ndash; User-defined, opaque data</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiFileIO {
    aiFileOpenProc OpenProc;
    aiFileCloseProc CloseProc;
    aiUserData UserData;
}</code></pre>
 */
public class AIFileIO extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		OPENPROC,
		CLOSEPROC,
		USERDATA;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		OPENPROC = layout.offsetof(0);
		CLOSEPROC = layout.offsetof(1);
		USERDATA = layout.offsetof(2);
	}

	AIFileIO(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIFileIO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIFileIO(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the {@code AIFileOpenProc} instance at the {@code OpenProc} field. */
	public AIFileOpenProc OpenProc() { return AIFileOpenProc.create(nOpenProc(address())); }
	/** Returns the {@code AIFileCloseProc} instance at the {@code CloseProc} field. */
	public AIFileCloseProc CloseProc() { return AIFileCloseProc.create(nCloseProc(address())); }
	/** Returns the value of the {@code UserData} field. */
	public long UserData() { return nUserData(address()); }

	/** Sets the address of the specified {@link AIFileOpenProcI} to the {@code OpenProc} field. */
	public AIFileIO OpenProc(AIFileOpenProcI value) { nOpenProc(address(), addressSafe(value)); return this; }
	/** Sets the address of the specified {@link AIFileCloseProcI} to the {@code CloseProc} field. */
	public AIFileIO CloseProc(AIFileCloseProcI value) { nCloseProc(address(), addressSafe(value)); return this; }
	/** Sets the specified value to the {@code UserData} field. */
	public AIFileIO UserData(long value) { nUserData(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public AIFileIO set(
		AIFileOpenProcI OpenProc,
		AIFileCloseProcI CloseProc,
		long UserData
	) {
		OpenProc(OpenProc);
		CloseProc(CloseProc);
		UserData(UserData);

		return this;
	}

	/** Unsafe version of {@link #set(AIFileIO) set}. */
	public AIFileIO nset(long struct) {
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
	public AIFileIO set(AIFileIO src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link AIFileIO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AIFileIO malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AIFileIO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AIFileIO calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AIFileIO} instance allocated with {@link BufferUtils}. */
	public static AIFileIO create() {
		return new AIFileIO(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AIFileIO} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIFileIO create(long address) {
		return address == NULL ? null : new AIFileIO(address, null);
	}

	/**
	 * Returns a new {@link AIFileIO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIFileIO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIFileIO.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AIFileIO.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AIFileIO} instance allocated on the thread-local {@link MemoryStack}. */
	public static AIFileIO mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AIFileIO} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AIFileIO callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AIFileIO} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIFileIO mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AIFileIO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIFileIO callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AIFileIO.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIFileIO.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIFileIO.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIFileIO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #OpenProc}. */
	public static long nOpenProc(long struct) { return memGetAddress(struct + AIFileIO.OPENPROC); }
	/** Unsafe version of {@link #CloseProc}. */
	public static long nCloseProc(long struct) { return memGetAddress(struct + AIFileIO.CLOSEPROC); }
	/** Unsafe version of {@link #UserData}. */
	public static long nUserData(long struct) { return memGetAddress(struct + AIFileIO.USERDATA); }

	/** Unsafe version of {@link #OpenProc(AIFileOpenProcI) OpenProc}. */
	public static void nOpenProc(long struct, long value) { memPutAddress(struct + AIFileIO.OPENPROC, check(value)); }
	/** Unsafe version of {@link #CloseProc(AIFileCloseProcI) CloseProc}. */
	public static void nCloseProc(long struct, long value) { memPutAddress(struct + AIFileIO.CLOSEPROC, check(value)); }
	/** Unsafe version of {@link #UserData(long) UserData}. */
	public static void nUserData(long struct, long value) { memPutAddress(struct + AIFileIO.USERDATA, check(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + AIFileIO.OPENPROC));
		check(memGetAddress(struct + AIFileIO.CLOSEPROC));
		check(memGetAddress(struct + AIFileIO.USERDATA));
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

	/** An array of {@link AIFileIO} structs. */
	public static class Buffer extends StructBuffer<AIFileIO, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AIFileIO.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIFileIO#SIZEOF}, and its mark will be undefined.
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
		protected AIFileIO newInstance(long address) {
			return new AIFileIO(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the {@code AIFileOpenProc} instance at the {@code OpenProc} field. */
		public AIFileOpenProc OpenProc() { return AIFileOpenProc.create(AIFileIO.nOpenProc(address())); }
		/** Returns the {@code AIFileCloseProc} instance at the {@code CloseProc} field. */
		public AIFileCloseProc CloseProc() { return AIFileCloseProc.create(AIFileIO.nCloseProc(address())); }
		/** Returns the value of the {@code UserData} field. */
		public long UserData() { return AIFileIO.nUserData(address()); }

		/** Sets the address of the specified {@link AIFileOpenProcI} to the {@code OpenProc} field. */
		public AIFileIO.Buffer OpenProc(AIFileOpenProcI value) { AIFileIO.nOpenProc(address(), addressSafe(value)); return this; }
		/** Sets the address of the specified {@link AIFileCloseProcI} to the {@code CloseProc} field. */
		public AIFileIO.Buffer CloseProc(AIFileCloseProcI value) { AIFileIO.nCloseProc(address(), addressSafe(value)); return this; }
		/** Sets the specified value to the {@code UserData} field. */
		public AIFileIO.Buffer UserData(long value) { AIFileIO.nUserData(address(), value); return this; }

	}

}