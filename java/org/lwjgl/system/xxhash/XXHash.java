/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.xxhash;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a href="https://github.com/Cyan4973/xxHash">xxhash</a>.
 * 
 * <p>xxHash is an extremely fast Hash algorithm, running at RAM speed limits. It also successfully passes all tests from the SMHasher suite.</p>
 */
public class XXHash {

	/** Error codes. */
	public static final int
		OK    = 0x0,
		ERROR = 0x1;

	static { Library.initialize(); }

	@JavadocExclude
	protected XXHash() {
		throw new UnsupportedOperationException();
	}

	// --- [ XXH32 ] ---

	/** JNI method for {@link #XXH32 32} */
	@JavadocExclude
	public static native int nXXH32(long input, long length, int seed);

	/**
	 * Calculates the 32-bits hash of sequence {@code length} bytes stored at memory address {@code input}.
	 * 
	 * <p>This function successfully passes all SMHasher tests.</p>
	 *
	 * @param input  the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param length the number of bytes stored at memory address {@code input}
	 * @param seed   the seed that can be used to alter the result predictably
	 */
	public static int XXH32(ByteBuffer input, long length, int seed) {
		if ( CHECKS )
			checkBuffer(input, length);
		return nXXH32(memAddress(input), length, seed);
	}

	/** Alternative version of: {@link #XXH32 32} */
	public static int XXH32(ByteBuffer input, int seed) {
		return nXXH32(memAddress(input), input.remaining(), seed);
	}

	// --- [ XXH64 ] ---

	/** JNI method for {@link #XXH64 64} */
	@JavadocExclude
	public static native long nXXH64(long input, long length, long seed);

	/**
	 * 64-bit version of {@link #XXH32 32}. Faster on 64-bits systems. Slower on 32-bits systems.
	 *
	 * @param input  the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param length the number of bytes stored at memory address {@code input}
	 * @param seed   the seed that can be used to alter the result predictably
	 */
	public static long XXH64(ByteBuffer input, long length, long seed) {
		if ( CHECKS )
			checkBuffer(input, length);
		return nXXH64(memAddress(input), length, seed);
	}

	/** Alternative version of: {@link #XXH64 64} */
	public static long XXH64(ByteBuffer input, long seed) {
		return nXXH64(memAddress(input), input.remaining(), seed);
	}

	// --- [ XXH32_createState ] ---

	/** JNI method for {@link #XXH32_createState 32_createState} */
	@JavadocExclude
	public static native long nXXH32_createState();

	/**
	 * Creates memory for {@link XXH32State}. The state must then be initialized using {@link #XXH32_reset 32_reset} before first use.
	 * 
	 * <p><b>LWJGL note</b>: This function simply delegates to the system {@code malloc()} function.</p>
	 */
	public static XXH32State XXH32_createState() {
		long __result = nXXH32_createState();
		return new XXH32State(__result);
	}

	// --- [ XXH32_freeState ] ---

	/** JNI method for {@link #XXH32_freeState 32_freeState} */
	@JavadocExclude
	public static native int nXXH32_freeState(long statePtr);

	/**
	 * Frees the specified {@link XXH32State}.
	 * 
	 * <p><b>LWJGL note</b>: This function simply delegates to the system {@code free()} function.</p>
	 *
	 * @param statePtr the state to free
	 */
	public static int XXH32_freeState(XXH32State statePtr) {
		return nXXH32_freeState(statePtr.address());
	}

	// --- [ XXH64_createState ] ---

	/** JNI method for {@link #XXH64_createState 64_createState} */
	@JavadocExclude
	public static native long nXXH64_createState();

	/** 64-bit version of {@link #XXH32_createState 32_createState}. */
	public static XXH64State XXH64_createState() {
		long __result = nXXH64_createState();
		return new XXH64State(__result);
	}

	// --- [ XXH64_freeState ] ---

	/** JNI method for {@link #XXH64_freeState 64_freeState} */
	@JavadocExclude
	public static native int nXXH64_freeState(long statePtr);

	/**
	 * 64-bit version of {@link #XXH32_freeState 32_freeState}.
	 *
	 * @param statePtr the state to free
	 */
	public static int XXH64_freeState(XXH64State statePtr) {
		return nXXH64_freeState(statePtr.address());
	}

	// --- [ XXH32_reset ] ---

	/** JNI method for {@link #XXH32_reset 32_reset} */
	@JavadocExclude
	public static native int nXXH32_reset(long statePtr, int seed);

	/**
	 * Resets the specified {@link XXH32State}.
	 *
	 * @param statePtr the {@link XXH32State} to reset
	 * @param seed     the seed that can be used to alter the hashing result predictably
	 */
	public static int XXH32_reset(XXH32State statePtr, int seed) {
		return nXXH32_reset(statePtr.address(), seed);
	}

	// --- [ XXH32_update ] ---

	/** JNI method for {@link #XXH32_update 32_update} */
	@JavadocExclude
	public static native int nXXH32_update(long statePtr, long input, long length);

	/**
	 * Calculate the xxHash of an input provided in multiple smaller packets, as opposed to an input provided as a single block.
	 * 
	 * <p>The XXH state space must first be allocated.</p>
	 * 
	 * <p>Start a new hash by initializing state with a seed, using {@link #XXH32_reset 32_reset}.</p>
	 * 
	 * <p>Then, feed the hash state by calling {@link #XXH32_update 32_update} as many times as necessary. Obviously, input must be valid, meaning allocated and read accessible.
	 * The function returns an error code, with 0 meaning OK, and any other value meaning there is an error.</p>
	 *
	 * @param statePtr the {@link XXH32State} to use
	 * @param input    the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param length   the number of bytes stored at memory address {@code input}
	 */
	public static int XXH32_update(XXH32State statePtr, ByteBuffer input, long length) {
		if ( CHECKS )
			checkBuffer(input, length);
		return nXXH32_update(statePtr.address(), memAddress(input), length);
	}

	/** Alternative version of: {@link #XXH32_update 32_update} */
	public static int XXH32_update(XXH32State statePtr, ByteBuffer input) {
		return nXXH32_update(statePtr.address(), memAddress(input), input.remaining());
	}

	// --- [ XXH32_digest ] ---

	/** JNI method for {@link #XXH32_digest 32_digest} */
	@JavadocExclude
	public static native int nXXH32_digest(long statePtr);

	/**
	 * Returns the final 32-bits hash of the specified {@link XXH32State}.
	 * 
	 * <p>You can nonetheless continue feeding the hash state with more input, and therefore get some new hashes, by calling again {@link #XXH32_digest 32_digest}.</p>
	 * 
	 * <p>When you are done, don't forget to free XXH state space, using {@link #XXH32_freeState 32_freeState}.</p>
	 *
	 * @param statePtr the {@link XXH32State} to use
	 */
	public static int XXH32_digest(XXH32State statePtr) {
		return nXXH32_digest(statePtr.address());
	}

	// --- [ XXH64_reset ] ---

	/** JNI method for {@link #XXH64_reset 64_reset} */
	@JavadocExclude
	public static native int nXXH64_reset(long statePtr, long seed);

	/**
	 * 64-bit version of {@link #XXH32_reset 32_reset}.
	 *
	 * @param statePtr the {@link XXH64State} to reset
	 * @param seed     the seed that can be used to alter the hashing result predictably
	 */
	public static int XXH64_reset(XXH64State statePtr, long seed) {
		return nXXH64_reset(statePtr.address(), seed);
	}

	// --- [ XXH64_update ] ---

	/** JNI method for {@link #XXH64_update 64_update} */
	@JavadocExclude
	public static native int nXXH64_update(long statePtr, long input, long length);

	/**
	 * 64-bit version of {@link #XXH32_update 32_update}.
	 *
	 * @param statePtr the {@link XXH64State} to use
	 * @param input    the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param length   the number of bytes stored at memory address {@code input}
	 */
	public static int XXH64_update(XXH64State statePtr, ByteBuffer input, long length) {
		if ( CHECKS )
			checkBuffer(input, length);
		return nXXH64_update(statePtr.address(), memAddress(input), length);
	}

	/** Alternative version of: {@link #XXH64_update 64_update} */
	public static int XXH64_update(XXH64State statePtr, ByteBuffer input) {
		return nXXH64_update(statePtr.address(), memAddress(input), input.remaining());
	}

	// --- [ XXH64_digest ] ---

	/** JNI method for {@link #XXH64_digest 64_digest} */
	@JavadocExclude
	public static native long nXXH64_digest(long statePtr);

	/**
	 * 64-bit version of {@link #XXH32_digest 32_digest}.
	 *
	 * @param statePtr the {@link XXH64State} to use
	 */
	public static long XXH64_digest(XXH64State statePtr) {
		return nXXH64_digest(statePtr.address());
	}

}