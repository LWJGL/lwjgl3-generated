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

/**
 * Comprises function pointers which are described individually below. jemalloc uses these functions to manage chunk lifetime, which starts off with
 * allocation of mapped committed memory, in the simplest case followed by deallocation. However, there are performance and platform reasons to retain chunks
 * for later reuse. Cleanup attempts cascade from deallocation to decommit to purging, which gives the chunk management functions opportunities to reject the
 * most permanent cleanup operations in favor of less permanent (and often less costly) operations. The chunk splitting and merging operations can also be
 * opted out of, but this is mainly intended to support platforms on which virtual memory mappings provided by the operating system kernel do not
 * automatically coalesce and split, e.g. Windows.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct chunk_hooks_t {
 *     chunk_alloc_t alloc;
 *     chunk_dalloc_t dalloc;
 *     chunk_commit_t commit;
 *     chunk_decommit_t decommit;
 *     chunk_purge_t purge;
 *     chunk_split_t split;
 *     chunk_merge_t merge;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>alloc</td><td>the chunk allocation hook</td></tr>
 * <tr><td>dalloc</td><td>the chunk deallocation hook</td></tr>
 * <tr><td>commit</td><td>the chunk commit hook</td></tr>
 * <tr><td>decommit</td><td>the chunk decommit hook</td></tr>
 * <tr><td>purge</td><td>the chunk purge hook</td></tr>
 * <tr><td>split</td><td>the chunk split hook</td></tr>
 * <tr><td>merge</td><td>the chunk merge hook</td></tr>
 * </table>
 */
public class ChunkHooks extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ALLOC = layout.offsetof(0);
		DALLOC = layout.offsetof(1);
		COMMIT = layout.offsetof(2);
		DECOMMIT = layout.offsetof(3);
		PURGE = layout.offsetof(4);
		SPLIT = layout.offsetof(5);
		MERGE = layout.offsetof(6);
	}

	ChunkHooks(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link ChunkHooks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public ChunkHooks(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the {@code ChunkAlloc} instance at the {@code alloc} field. */
	public ChunkAlloc alloc() { return nalloc(address()); }
	/** Returns the {@code ChunkDalloc} instance at the {@code dalloc} field. */
	public ChunkDalloc dalloc() { return ndalloc(address()); }
	/** Returns the {@code ChunkCommit} instance at the {@code commit} field. */
	public ChunkCommit commit() { return ncommit(address()); }
	/** Returns the {@code ChunkDecommit} instance at the {@code decommit} field. */
	public ChunkDecommit decommit() { return ndecommit(address()); }
	/** Returns the {@code ChunkPurge} instance at the {@code purge} field. */
	public ChunkPurge purge() { return npurge(address()); }
	/** Returns the {@code ChunkSplit} instance at the {@code split} field. */
	public ChunkSplit split() { return nsplit(address()); }
	/** Returns the {@code ChunkMerge} instance at the {@code merge} field. */
	public ChunkMerge merge() { return nmerge(address()); }

	/** Sets the address of the specified {@link ChunkAlloc} to the {@code alloc} field. */
	public ChunkHooks alloc(ChunkAlloc value) { nalloc(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkDalloc} to the {@code dalloc} field. */
	public ChunkHooks dalloc(ChunkDalloc value) { ndalloc(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkCommit} to the {@code commit} field. */
	public ChunkHooks commit(ChunkCommit value) { ncommit(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkDecommit} to the {@code decommit} field. */
	public ChunkHooks decommit(ChunkDecommit value) { ndecommit(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkPurge} to the {@code purge} field. */
	public ChunkHooks purge(ChunkPurge value) { npurge(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkSplit} to the {@code split} field. */
	public ChunkHooks split(ChunkSplit value) { nsplit(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkMerge} to the {@code merge} field. */
	public ChunkHooks merge(ChunkMerge value) { nmerge(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public ChunkHooks set(
		ChunkAlloc alloc,
		ChunkDalloc dalloc,
		ChunkCommit commit,
		ChunkDecommit decommit,
		ChunkPurge purge,
		ChunkSplit split,
		ChunkMerge merge
	) {
		alloc(alloc);
		dalloc(dalloc);
		commit(commit);
		decommit(decommit);
		purge(purge);
		split(split);
		merge(merge);

		return this;
	}

	/** Unsafe version of {@link #set(ChunkHooks) set}. */
	public ChunkHooks nset(long struct) {
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
	public ChunkHooks set(ChunkHooks src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(ChunkHooks) set}. */
	public ChunkHooks set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link ChunkHooks} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static ChunkHooks malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link ChunkHooks} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static ChunkHooks calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link ChunkHooks} instance allocated with {@link BufferUtils}. */
	public static ChunkHooks create() {
		return new ChunkHooks(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link ChunkHooks} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static ChunkHooks create(long address) {
		return address == NULL ? null : new ChunkHooks(address, null);
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link ChunkHooks.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #alloc}. */
	public static ChunkAlloc nalloc(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + ChunkHooks.ALLOC)); }
	/** Unsafe version of {@link #dalloc}. */
	public static ChunkDalloc ndalloc(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + ChunkHooks.DALLOC)); }
	/** Unsafe version of {@link #commit}. */
	public static ChunkCommit ncommit(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + ChunkHooks.COMMIT)); }
	/** Unsafe version of {@link #decommit}. */
	public static ChunkDecommit ndecommit(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + ChunkHooks.DECOMMIT)); }
	/** Unsafe version of {@link #purge}. */
	public static ChunkPurge npurge(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + ChunkHooks.PURGE)); }
	/** Unsafe version of {@link #split}. */
	public static ChunkSplit nsplit(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + ChunkHooks.SPLIT)); }
	/** Unsafe version of {@link #merge}. */
	public static ChunkMerge nmerge(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + ChunkHooks.MERGE)); }

	/** Unsafe version of {@link #alloc(ChunkAlloc) alloc}. */
	public static void nalloc(long struct, ChunkAlloc value) { memPutAddress(struct+ ChunkHooks.ALLOC, value.address()); }
	/** Unsafe version of {@link #dalloc(ChunkDalloc) dalloc}. */
	public static void ndalloc(long struct, ChunkDalloc value) { memPutAddress(struct+ ChunkHooks.DALLOC, value.address()); }
	/** Unsafe version of {@link #commit(ChunkCommit) commit}. */
	public static void ncommit(long struct, ChunkCommit value) { memPutAddress(struct+ ChunkHooks.COMMIT, value.address()); }
	/** Unsafe version of {@link #decommit(ChunkDecommit) decommit}. */
	public static void ndecommit(long struct, ChunkDecommit value) { memPutAddress(struct+ ChunkHooks.DECOMMIT, value.address()); }
	/** Unsafe version of {@link #purge(ChunkPurge) purge}. */
	public static void npurge(long struct, ChunkPurge value) { memPutAddress(struct+ ChunkHooks.PURGE, value.address()); }
	/** Unsafe version of {@link #split(ChunkSplit) split}. */
	public static void nsplit(long struct, ChunkSplit value) { memPutAddress(struct+ ChunkHooks.SPLIT, value.address()); }
	/** Unsafe version of {@link #merge(ChunkMerge) merge}. */
	public static void nmerge(long struct, ChunkMerge value) { memPutAddress(struct+ ChunkHooks.MERGE, value.address()); }

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
		protected ChunkHooks newInstance(long address) {
			return new ChunkHooks(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the {@code ChunkAlloc} instance at the {@code alloc} field. */
		public ChunkAlloc alloc() { return ChunkHooks.nalloc(address()); }
		/** Returns the {@code ChunkDalloc} instance at the {@code dalloc} field. */
		public ChunkDalloc dalloc() { return ChunkHooks.ndalloc(address()); }
		/** Returns the {@code ChunkCommit} instance at the {@code commit} field. */
		public ChunkCommit commit() { return ChunkHooks.ncommit(address()); }
		/** Returns the {@code ChunkDecommit} instance at the {@code decommit} field. */
		public ChunkDecommit decommit() { return ChunkHooks.ndecommit(address()); }
		/** Returns the {@code ChunkPurge} instance at the {@code purge} field. */
		public ChunkPurge purge() { return ChunkHooks.npurge(address()); }
		/** Returns the {@code ChunkSplit} instance at the {@code split} field. */
		public ChunkSplit split() { return ChunkHooks.nsplit(address()); }
		/** Returns the {@code ChunkMerge} instance at the {@code merge} field. */
		public ChunkMerge merge() { return ChunkHooks.nmerge(address()); }

		/** Sets the address of the specified {@link ChunkAlloc} to the {@code alloc} field. */
		public ChunkHooks.Buffer alloc(ChunkAlloc value) { ChunkHooks.nalloc(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkDalloc} to the {@code dalloc} field. */
		public ChunkHooks.Buffer dalloc(ChunkDalloc value) { ChunkHooks.ndalloc(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkCommit} to the {@code commit} field. */
		public ChunkHooks.Buffer commit(ChunkCommit value) { ChunkHooks.ncommit(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkDecommit} to the {@code decommit} field. */
		public ChunkHooks.Buffer decommit(ChunkDecommit value) { ChunkHooks.ndecommit(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkPurge} to the {@code purge} field. */
		public ChunkHooks.Buffer purge(ChunkPurge value) { ChunkHooks.npurge(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkSplit} to the {@code split} field. */
		public ChunkHooks.Buffer split(ChunkSplit value) { ChunkHooks.nsplit(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkMerge} to the {@code merge} field. */
		public ChunkHooks.Buffer merge(ChunkMerge value) { ChunkHooks.nmerge(address(), value); return this; }

	}

}