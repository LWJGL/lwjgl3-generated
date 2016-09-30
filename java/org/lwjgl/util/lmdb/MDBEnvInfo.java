/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Information about the environment.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code me_mapaddr} &ndash; Address of map, if fixed.</li>
 * <li>{@code me_mapsize} &ndash; Size of the data memory map.</li>
 * <li>{@code me_last_pgno} &ndash; ID of the last used page.</li>
 * <li>{@code me_last_txnid} &ndash; ID of the last committed transaction.</li>
 * <li>{@code me_maxreaders} &ndash; Max reader slots in the environment.</li>
 * <li>{@code me_numreaders} &ndash; Max reader slots used in the environment.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct MDB_envinfo {
    void * me_mapaddr;
    mdb_size_t me_mapsize;
    mdb_size_t me_last_pgno;
    mdb_size_t me_last_txnid;
    unsigned int me_maxreaders;
    unsigned int me_numreaders;
}</code></pre>
 */
public class MDBEnvInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		ME_MAPADDR,
		ME_MAPSIZE,
		ME_LAST_PGNO,
		ME_LAST_TXNID,
		ME_MAXREADERS,
		ME_NUMREADERS;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ME_MAPADDR = layout.offsetof(0);
		ME_MAPSIZE = layout.offsetof(1);
		ME_LAST_PGNO = layout.offsetof(2);
		ME_LAST_TXNID = layout.offsetof(3);
		ME_MAXREADERS = layout.offsetof(4);
		ME_NUMREADERS = layout.offsetof(5);
	}

	MDBEnvInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link MDBEnvInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public MDBEnvInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code me_mapaddr} field. */
	public long me_mapaddr() { return nme_mapaddr(address()); }
	/** Returns the value of the {@code me_mapsize} field. */
	public long me_mapsize() { return nme_mapsize(address()); }
	/** Returns the value of the {@code me_last_pgno} field. */
	public long me_last_pgno() { return nme_last_pgno(address()); }
	/** Returns the value of the {@code me_last_txnid} field. */
	public long me_last_txnid() { return nme_last_txnid(address()); }
	/** Returns the value of the {@code me_maxreaders} field. */
	public int me_maxreaders() { return nme_maxreaders(address()); }
	/** Returns the value of the {@code me_numreaders} field. */
	public int me_numreaders() { return nme_numreaders(address()); }

	// -----------------------------------

	/** Returns a new {@link MDBEnvInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static MDBEnvInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link MDBEnvInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static MDBEnvInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link MDBEnvInfo} instance allocated with {@link BufferUtils}. */
	public static MDBEnvInfo create() {
		return new MDBEnvInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link MDBEnvInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static MDBEnvInfo create(long address) {
		return address == NULL ? null : new MDBEnvInfo(address, null);
	}

	/**
	 * Returns a new {@link MDBEnvInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MDBEnvInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MDBEnvInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link MDBEnvInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link MDBEnvInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static MDBEnvInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link MDBEnvInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static MDBEnvInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link MDBEnvInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static MDBEnvInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link MDBEnvInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static MDBEnvInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link MDBEnvInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link MDBEnvInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link MDBEnvInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link MDBEnvInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #me_mapaddr}. */
	public static long nme_mapaddr(long struct) { return memGetAddress(struct + MDBEnvInfo.ME_MAPADDR); }
	/** Unsafe version of {@link #me_mapsize}. */
	public static long nme_mapsize(long struct) { return memGetAddress(struct + MDBEnvInfo.ME_MAPSIZE); }
	/** Unsafe version of {@link #me_last_pgno}. */
	public static long nme_last_pgno(long struct) { return memGetAddress(struct + MDBEnvInfo.ME_LAST_PGNO); }
	/** Unsafe version of {@link #me_last_txnid}. */
	public static long nme_last_txnid(long struct) { return memGetAddress(struct + MDBEnvInfo.ME_LAST_TXNID); }
	/** Unsafe version of {@link #me_maxreaders}. */
	public static int nme_maxreaders(long struct) { return memGetInt(struct + MDBEnvInfo.ME_MAXREADERS); }
	/** Unsafe version of {@link #me_numreaders}. */
	public static int nme_numreaders(long struct) { return memGetInt(struct + MDBEnvInfo.ME_NUMREADERS); }

	// -----------------------------------

	/** An array of {@link MDBEnvInfo} structs. */
	public static final class Buffer extends StructBuffer<MDBEnvInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link MDBEnvInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link MDBEnvInfo#SIZEOF}, and its mark will be undefined.
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
		protected MDBEnvInfo newInstance(long address) {
			return new MDBEnvInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code me_mapaddr} field. */
		public long me_mapaddr() { return MDBEnvInfo.nme_mapaddr(address()); }
		/** Returns the value of the {@code me_mapsize} field. */
		public long me_mapsize() { return MDBEnvInfo.nme_mapsize(address()); }
		/** Returns the value of the {@code me_last_pgno} field. */
		public long me_last_pgno() { return MDBEnvInfo.nme_last_pgno(address()); }
		/** Returns the value of the {@code me_last_txnid} field. */
		public long me_last_txnid() { return MDBEnvInfo.nme_last_txnid(address()); }
		/** Returns the value of the {@code me_maxreaders} field. */
		public int me_maxreaders() { return MDBEnvInfo.nme_maxreaders(address()); }
		/** Returns the value of the {@code me_numreaders} field. */
		public int me_numreaders() { return MDBEnvInfo.nme_numreaders(address()); }

	}

}