/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Chunk management hooks. */
public class ChunkHooks extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ALLOC,
		DALLOC,
		COMMIT,
		DECOMMIT,
		PURGE,
		SPLIT,
		MERGE;

	static {
		IntBuffer offsets = memAllocInt(7);

		SIZEOF = offsets(memAddress(offsets));

		ALLOC = offsets.get(0);
		DALLOC = offsets.get(1);
		COMMIT = offsets.get(2);
		DECOMMIT = offsets.get(3);
		PURGE = offsets.get(4);
		SPLIT = offsets.get(5);
		MERGE = offsets.get(6);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	ChunkHooks(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link ChunkHooks} instance at the specified memory address. */
	public ChunkHooks(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link ChunkHooks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public ChunkHooks(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public long getAlloc() { return ngetAlloc(address()); }
	public long getDalloc() { return ngetDalloc(address()); }
	public long getCommit() { return ngetCommit(address()); }
	public long getDecommit() { return ngetDecommit(address()); }
	public long getPurge() { return ngetPurge(address()); }
	public long getSplit() { return ngetSplit(address()); }
	public long getMerge() { return ngetMerge(address()); }

	public ChunkHooks setAlloc(long alloc) { nsetAlloc(address(), alloc); return this; }
	public ChunkHooks setDalloc(long dalloc) { nsetDalloc(address(), dalloc); return this; }
	public ChunkHooks setCommit(long commit) { nsetCommit(address(), commit); return this; }
	public ChunkHooks setDecommit(long decommit) { nsetDecommit(address(), decommit); return this; }
	public ChunkHooks setPurge(long purge) { nsetPurge(address(), purge); return this; }
	public ChunkHooks setSplit(long split) { nsetSplit(address(), split); return this; }
	public ChunkHooks setMerge(long merge) { nsetMerge(address(), merge); return this; }

	/** Initializes this struct with the specified values. */
	public ChunkHooks set(
		long alloc,
		long dalloc,
		long commit,
		long decommit,
		long purge,
		long split,
		long merge
	) {
		setAlloc(alloc);
		setDalloc(dalloc);
		setCommit(commit);
		setDecommit(decommit);
		setPurge(purge);
		setSplit(split);
		setMerge(merge);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public ChunkHooks nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public ChunkHooks set(ChunkHooks src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public ChunkHooks set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link ChunkHooks} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static ChunkHooks malloc() {
		return new ChunkHooks(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link ChunkHooks} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static ChunkHooks calloc() {
		return new ChunkHooks(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link ChunkHooks} instance allocated with {@link BufferUtils}. */
	public static ChunkHooks create() {
		return new ChunkHooks(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static long ngetAlloc(long struct) { return memGetAddress(struct + ALLOC); }
	public static long getAlloc(ByteBuffer struct) { return ngetAlloc(memAddress(struct)); }
	public static long ngetDalloc(long struct) { return memGetAddress(struct + DALLOC); }
	public static long getDalloc(ByteBuffer struct) { return ngetDalloc(memAddress(struct)); }
	public static long ngetCommit(long struct) { return memGetAddress(struct + COMMIT); }
	public static long getCommit(ByteBuffer struct) { return ngetCommit(memAddress(struct)); }
	public static long ngetDecommit(long struct) { return memGetAddress(struct + DECOMMIT); }
	public static long getDecommit(ByteBuffer struct) { return ngetDecommit(memAddress(struct)); }
	public static long ngetPurge(long struct) { return memGetAddress(struct + PURGE); }
	public static long getPurge(ByteBuffer struct) { return ngetPurge(memAddress(struct)); }
	public static long ngetSplit(long struct) { return memGetAddress(struct + SPLIT); }
	public static long getSplit(ByteBuffer struct) { return ngetSplit(memAddress(struct)); }
	public static long ngetMerge(long struct) { return memGetAddress(struct + MERGE); }
	public static long getMerge(ByteBuffer struct) { return ngetMerge(memAddress(struct)); }

	public static void nsetAlloc(long struct, long alloc) { memPutAddress(struct + ALLOC, alloc); }
	public static void setAlloc(ByteBuffer struct, long alloc) { nsetAlloc(memAddress(struct), alloc); }
	public static void nsetDalloc(long struct, long dalloc) { memPutAddress(struct + DALLOC, dalloc); }
	public static void setDalloc(ByteBuffer struct, long dalloc) { nsetDalloc(memAddress(struct), dalloc); }
	public static void nsetCommit(long struct, long commit) { memPutAddress(struct + COMMIT, commit); }
	public static void setCommit(ByteBuffer struct, long commit) { nsetCommit(memAddress(struct), commit); }
	public static void nsetDecommit(long struct, long decommit) { memPutAddress(struct + DECOMMIT, decommit); }
	public static void setDecommit(ByteBuffer struct, long decommit) { nsetDecommit(memAddress(struct), decommit); }
	public static void nsetPurge(long struct, long purge) { memPutAddress(struct + PURGE, purge); }
	public static void setPurge(ByteBuffer struct, long purge) { nsetPurge(memAddress(struct), purge); }
	public static void nsetSplit(long struct, long split) { memPutAddress(struct + SPLIT, split); }
	public static void setSplit(ByteBuffer struct, long split) { nsetSplit(memAddress(struct), split); }
	public static void nsetMerge(long struct, long merge) { memPutAddress(struct + MERGE, merge); }
	public static void setMerge(ByteBuffer struct, long merge) { nsetMerge(memAddress(struct), merge); }

	// -----------------------------------

	/** An array of {@link ChunkHooks} structs. */
	public static final class Buffer extends StructBuffer<ChunkHooks, Buffer> {

		/**
		 * Creates a new {@link ChunkHooks.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link ChunkHooks#SIZEOF}, and its mark will be undefined.
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
		protected ChunkHooks newInstance(long address) {
			return new ChunkHooks(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public long getAlloc() { return ngetAlloc(address()); }
		public long getDalloc() { return ngetDalloc(address()); }
		public long getCommit() { return ngetCommit(address()); }
		public long getDecommit() { return ngetDecommit(address()); }
		public long getPurge() { return ngetPurge(address()); }
		public long getSplit() { return ngetSplit(address()); }
		public long getMerge() { return ngetMerge(address()); }

		public ChunkHooks.Buffer setAlloc(long alloc) { nsetAlloc(address(), alloc); return this; }
		public ChunkHooks.Buffer setDalloc(long dalloc) { nsetDalloc(address(), dalloc); return this; }
		public ChunkHooks.Buffer setCommit(long commit) { nsetCommit(address(), commit); return this; }
		public ChunkHooks.Buffer setDecommit(long decommit) { nsetDecommit(address(), decommit); return this; }
		public ChunkHooks.Buffer setPurge(long purge) { nsetPurge(address(), purge); return this; }
		public ChunkHooks.Buffer setSplit(long split) { nsetSplit(address(), split); return this; }
		public ChunkHooks.Buffer setMerge(long merge) { nsetMerge(address(), merge); return this; }

	}

}