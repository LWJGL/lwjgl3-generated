/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/shading_language_include.txt">ARB_shading_language_include</a> extension.
 * 
 * <p>This extension introduces a {@code &#35;include} GLSL directive to allow reusing the same shader text in multiple shaders and defines the semantics and syntax of
 * the names allowed in {@code &#35;include} directives. It also defines API mechanisms to define the named string backing a {@code &#35;include}.</p>
 * 
 * <h3>Introduction</h3>
 * 
 * <p>The GLSL {@code &#35;include} mechanism looks up paths in a tree built through the OpenGL API. This appendix describes the syntax and semantic model of the tree and
 * paths into the tree. How the tree is used is up to users of the tree, like the OpenGL API or GLSL.</p>
 * 
 * <h3>The Tree</h3>
 * 
 * <p>The tree is a singly rooted hierarchy of tree locations. The root may have one or more child locations, and any location may in turn have its own
 * children. Except for the root, each location has exactly one parent; the root has no parent.</p>
 * 
 * <h3>Paths into the Tree</h3>
 * 
 * <p>The locations in the tree are created or looked up by path strings. The path string "/" locates the root of the tree. The path "/foo" locates the child
 * "foo" of the root. Formally, a valid path is a sequence of tokens delimited by the beginning of the string, by the path-separator forward slash ( / ),
 * and by the end of the string. The string "foo/bar" has two tokens; "foo" and "bar". The string "/foo/./bar" has 3 tokens; "foo", ".", and "bar". The
 * string "/foo/.." has two tokens; "foo" and "..". The string "/foo/.bar" has two tokens; "foo" and ".bar". A path is invalid if
 * <ul>
 * <li>{@code path} contains any characters not listed in Section 3.1 "Character Set", or the double quote character, or angled brackets, or any white
 * space characters other than the space character.</li>
 * <li>{@code path} has consecutive forward slashes ( // ); "/foo//bar" is not valid (zero length tokens are not allowed).</li>
 * <li>{@code path} ends with a forward slash ( / )</li>
 * <li>{@code path} contains no characters.</li>
 * </ul>
 * There are no path escape characters, so there is no way to get the forward slash delimiter within a single token.</p>
 * 
 * <p>When using a path to lookup a tree location, the path tokens are used to walk the tree. The initial location to start the walk is specified by the user
 * of the tree and is updated as follows by the tokens in the path. (Paths starting with "/" will start at the root.) Taken left to right:</p>
 * 
 * <p>The token ".." walks to the parent. Or, if already at the root, then the location remains at the root.</p>
 * 
 * <p>The token "." leaves the location unchanged.</p>
 * 
 * <p>Any other token is considered the name of a child of the current location, and walks to that child. (If there is no child of that name, this may result
 * in a failed lookup or in the child being created, as specified by the user of the tree for the operation being performed.)</p>
 * 
 * <h3>Associated Strings</h3>
 * 
 * <p>Each location in the tree can have an additional string associated with it (that a user like the {@code &#35;include} mechanism can use as an included string). This
 * is true even for locations that have children: "/foo/bar" can exist in the tree at the same time that "/foo" has an additional string associated with
 * it. Typically, when a path is used to find a location in the tree, it is for the purpose of returning this associated string.</p>
 * 
 * <p>Hence, the tree can be built from a collection of (path,string) pairs, where path is a string establishing the existence of a location in the tree and
 * string is the string associated with the node. Details of how to do this are specified by the user of the tree.</p>
 * 
 * <p>Requires GLSL 1.10.</p>
 */
public final class ARBShadingLanguageInclude {

	/** Accepted by the {@code type} parameter of NamedStringARB. */
	public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;

	/** Accepted by the {@code pname} parameter of GetNamedStringivARB. */
	public static final int
		GL_NAMED_STRING_LENGTH_ARB = 0x8DE9,
		GL_NAMED_STRING_TYPE_ARB   = 0x8DEA;

	/** Function address. */
	@JavadocExclude
	public final long
		NamedStringARB,
		DeleteNamedStringARB,
		CompileShaderIncludeARB,
		IsNamedStringARB,
		GetNamedStringARB,
		GetNamedStringivARB;

	@JavadocExclude
	public ARBShadingLanguageInclude(FunctionProvider provider) {
		NamedStringARB = provider.getFunctionAddress("glNamedStringARB");
		DeleteNamedStringARB = provider.getFunctionAddress("glDeleteNamedStringARB");
		CompileShaderIncludeARB = provider.getFunctionAddress("glCompileShaderIncludeARB");
		IsNamedStringARB = provider.getFunctionAddress("glIsNamedStringARB");
		GetNamedStringARB = provider.getFunctionAddress("glGetNamedStringARB");
		GetNamedStringivARB = provider.getFunctionAddress("glGetNamedStringivARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBShadingLanguageInclude} instance for the current context. */
	public static ARBShadingLanguageInclude getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBShadingLanguageInclude);
	}

	static ARBShadingLanguageInclude create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_shading_language_include") ) return null;

		ARBShadingLanguageInclude funcs = new ARBShadingLanguageInclude(provider);

		boolean supported = checkFunctions(
			funcs.NamedStringARB, funcs.DeleteNamedStringARB, funcs.CompileShaderIncludeARB, funcs.IsNamedStringARB, funcs.GetNamedStringARB, 
			funcs.GetNamedStringivARB
		);

		return GL.checkExtension("GL_ARB_shading_language_include", funcs, supported);
	}

	// --- [ glNamedStringARB ] ---

	/** JNI method for {@link #glNamedStringARB NamedStringARB} */
	@JavadocExclude
	public static native void nglNamedStringARB(int type, int namelen, long name, int stringlen, long string, long __functionAddress);

	/** Unsafe version of {@link #glNamedStringARB NamedStringARB} */
	@JavadocExclude
	public static void nglNamedStringARB(int type, int namelen, long name, int stringlen, long string) {
		long __functionAddress = getInstance().NamedStringARB;
		nglNamedStringARB(type, namelen, name, stringlen, string, __functionAddress);
	}

	/**
	 * Specifies a string and its name. Such strings can be included by name in shaders during compilation, allowing reuse of the same code segments.
	 * 
	 * <p>After calling NamedStringARB, the contents of {@code string} are associated with the tree location corresponding to {@code name}. If a string is already
	 * associated with that tree location, it will be replaced with the new {@code string}.</p>
	 *
	 * @param type      the string type. Must be:<br>{@link #GL_SHADER_INCLUDE_ARB SHADER_INCLUDE_ARB}
	 * @param namelen   the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
	 * @param name      the name associated with the string
	 * @param stringlen the number of characters in {@code string}. If negative, {@code string} is considered to be a null-terminated string.
	 * @param string    an arbitrary string of characters
	 */
	public static void glNamedStringARB(int type, int namelen, ByteBuffer name, int stringlen, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, namelen);
			checkBuffer(string, stringlen);
		}
		nglNamedStringARB(type, namelen, memAddress(name), stringlen, memAddress(string));
	}

	/** Alternative version of: {@link #glNamedStringARB NamedStringARB} */
	public static void glNamedStringARB(int type, ByteBuffer name, ByteBuffer string) {
		nglNamedStringARB(type, name.remaining(), memAddress(name), string.remaining(), memAddress(string));
	}

	/** CharSequence version of: {@link #glNamedStringARB NamedStringARB} */
	public static void glNamedStringARB(int type, CharSequence name, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, false);
		int nameEncodedLen = __buffer.getOffset() - nameEncoded;
		int stringEncoded = __buffer.stringParamUTF8(string, false);
		int stringEncodedLen = __buffer.getOffset() - stringEncoded;
		nglNamedStringARB(type, nameEncodedLen, __buffer.address(nameEncoded), stringEncodedLen, __buffer.address(stringEncoded));
	}

	// --- [ glDeleteNamedStringARB ] ---

	/** JNI method for {@link #glDeleteNamedStringARB DeleteNamedStringARB} */
	@JavadocExclude
	public static native void nglDeleteNamedStringARB(int namelen, long name, long __functionAddress);

	/** Unsafe version of {@link #glDeleteNamedStringARB DeleteNamedStringARB} */
	@JavadocExclude
	public static void nglDeleteNamedStringARB(int namelen, long name) {
		long __functionAddress = getInstance().DeleteNamedStringARB;
		nglDeleteNamedStringARB(namelen, name, __functionAddress);
	}

	/**
	 * Deletes a named string.
	 *
	 * @param namelen the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
	 * @param name    the name associated with the string
	 */
	public static void glDeleteNamedStringARB(int namelen, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(name, namelen);
		nglDeleteNamedStringARB(namelen, memAddress(name));
	}

	/** Alternative version of: {@link #glDeleteNamedStringARB DeleteNamedStringARB} */
	public static void glDeleteNamedStringARB(ByteBuffer name) {
		nglDeleteNamedStringARB(name.remaining(), memAddress(name));
	}

	/** CharSequence version of: {@link #glDeleteNamedStringARB DeleteNamedStringARB} */
	public static void glDeleteNamedStringARB(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, false);
		int nameEncodedLen = __buffer.getOffset() - nameEncoded;
		nglDeleteNamedStringARB(nameEncodedLen, __buffer.address(nameEncoded));
	}

	// --- [ glCompileShaderIncludeARB ] ---

	/** JNI method for {@link #glCompileShaderIncludeARB CompileShaderIncludeARB} */
	@JavadocExclude
	public static native void nglCompileShaderIncludeARB(int shader, int count, long path, long length, long __functionAddress);

	/** Unsafe version of {@link #glCompileShaderIncludeARB CompileShaderIncludeARB} */
	@JavadocExclude
	public static void nglCompileShaderIncludeARB(int shader, int count, long path, long length) {
		long __functionAddress = getInstance().CompileShaderIncludeARB;
		nglCompileShaderIncludeARB(shader, count, path, length, __functionAddress);
	}

	/**
	 * Compiles a shader object.
	 * 
	 * <p>The ordered list of {@code path}s is used during compilation, together with the arguments of {@code &#35;include} directives in the shader source, to search for
	 * named strings corresponding to the {@code &#35;include} directives. If a {@code &#35;include} directive does not correspond to a valid named string, compilation will fail.</p>
	 *
	 * @param shader the shader object compile
	 * @param count  
	 * @param path   an ordered array of {@code count} pointers to optionally null-terminated character strings defining search paths
	 * @param length an array {@code count} values with the number of characters in each string (the string length). If an element in {@code length} is negative, its
	 *               accompanying string is null-terminated. If {@code length} is {@code NULL}, all strings in the {@code path} argument are considered null-terminated.
	 */
	public static void glCompileShaderIncludeARB(int shader, int count, ByteBuffer path, ByteBuffer length) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(path, count << POINTER_SHIFT);
			if ( length != null ) checkBuffer(length, count << 2);
		}
		nglCompileShaderIncludeARB(shader, count, memAddress(path), memAddressSafe(length));
	}

	/** Alternative version of: {@link #glCompileShaderIncludeARB CompileShaderIncludeARB} */
	public static void glCompileShaderIncludeARB(int shader, PointerBuffer path, IntBuffer length) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, path.remaining());
		nglCompileShaderIncludeARB(shader, path.remaining(), memAddress(path), memAddressSafe(length));
	}

	// --- [ glIsNamedStringARB ] ---

	/** JNI method for {@link #glIsNamedStringARB IsNamedStringARB} */
	@JavadocExclude
	public static native boolean nglIsNamedStringARB(int namelen, long name, long __functionAddress);

	/** Unsafe version of {@link #glIsNamedStringARB IsNamedStringARB} */
	@JavadocExclude
	public static boolean nglIsNamedStringARB(int namelen, long name) {
		long __functionAddress = getInstance().IsNamedStringARB;
		return nglIsNamedStringARB(namelen, name, __functionAddress);
	}

	/**
	 * Returns {@link GL11#GL_TRUE TRUE} if the tree location corresponding to {@code name} has a string associated with it, and {@link GL11#GL_FALSE FALSE} if the tree location has no string
	 * associated with it.
	 *
	 * @param namelen the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
	 * @param name    the name associated with the string
	 */
	public static boolean glIsNamedStringARB(int namelen, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(name, namelen);
		return nglIsNamedStringARB(namelen, memAddress(name));
	}

	/** Alternative version of: {@link #glIsNamedStringARB IsNamedStringARB} */
	public static boolean glIsNamedStringARB(ByteBuffer name) {
		return nglIsNamedStringARB(name.remaining(), memAddress(name));
	}

	/** CharSequence version of: {@link #glIsNamedStringARB IsNamedStringARB} */
	public static boolean glIsNamedStringARB(CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, false);
		int nameEncodedLen = __buffer.getOffset() - nameEncoded;
		return nglIsNamedStringARB(nameEncodedLen, __buffer.address(nameEncoded));
	}

	// --- [ glGetNamedStringARB ] ---

	/** JNI method for {@link #glGetNamedStringARB GetNamedStringARB} */
	@JavadocExclude
	public static native void nglGetNamedStringARB(int namelen, long name, int bufSize, long stringlen, long string, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedStringARB GetNamedStringARB} */
	@JavadocExclude
	public static void nglGetNamedStringARB(int namelen, long name, int bufSize, long stringlen, long string) {
		long __functionAddress = getInstance().GetNamedStringARB;
		nglGetNamedStringARB(namelen, name, bufSize, stringlen, string, __functionAddress);
	}

	/**
	 * Returns in {@code string} the string corresponding to the specified {@code name}. The returned string will be null-terminated.
	 *
	 * @param namelen   the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
	 * @param name      the name associated with the string
	 * @param bufSize   the maximum number of characters that may be written into {@code string}, including the null terminator
	 * @param stringlen a buffer in which to place the actual number of characters written into {@code string}, excluding the null terminator. If {@code NULL}, no length is
	 *                  returned.
	 * @param string    a buffer in which to place the returned string
	 */
	public static void glGetNamedStringARB(int namelen, ByteBuffer name, int bufSize, ByteBuffer stringlen, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, namelen);
			checkBuffer(string, bufSize);
			if ( stringlen != null ) checkBuffer(stringlen, 1 << 2);
		}
		nglGetNamedStringARB(namelen, memAddress(name), bufSize, memAddressSafe(stringlen), memAddress(string));
	}

	/** Alternative version of: {@link #glGetNamedStringARB GetNamedStringARB} */
	public static void glGetNamedStringARB(ByteBuffer name, IntBuffer stringlen, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS )
			if ( stringlen != null ) checkBuffer(stringlen, 1);
		nglGetNamedStringARB(name.remaining(), memAddress(name), string.remaining(), memAddressSafe(stringlen), memAddress(string));
	}

	/** CharSequence version of: {@link #glGetNamedStringARB GetNamedStringARB} */
	public static void glGetNamedStringARB(CharSequence name, IntBuffer stringlen, ByteBuffer string) {
		if ( LWJGLUtil.CHECKS )
			if ( stringlen != null ) checkBuffer(stringlen, 1);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, false);
		int nameEncodedLen = __buffer.getOffset() - nameEncoded;
		nglGetNamedStringARB(nameEncodedLen, __buffer.address(nameEncoded), string.remaining(), memAddressSafe(stringlen), memAddress(string));
	}

	/** String return version of: {@link #glGetNamedStringARB GetNamedStringARB} */
	public static String glGetNamedStringARB(CharSequence name, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, false);
		int nameEncodedLen = __buffer.getOffset() - nameEncoded;
		int stringlen = __buffer.intParam();
		int string = __buffer.bufferParam(bufSize);
		nglGetNamedStringARB(nameEncodedLen, __buffer.address(nameEncoded), bufSize, __buffer.address(stringlen), __buffer.address(string));
		return memDecodeUTF8(memByteBuffer(__buffer.address(string), __buffer.intValue(stringlen)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetNamedStringARB GetNamedStringARB} */
	public static String glGetNamedStringARB(CharSequence name) {
		int bufSize = glGetNamedStringiARB(name, GL_NAMED_STRING_LENGTH_ARB);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, false);
		int nameEncodedLen = __buffer.getOffset() - nameEncoded;
		int stringlen = __buffer.intParam();
		int string = __buffer.bufferParam(bufSize);
		nglGetNamedStringARB(nameEncodedLen, __buffer.address(nameEncoded), bufSize, __buffer.address(stringlen), __buffer.address(string));
		return memDecodeUTF8(memByteBuffer(__buffer.address(string), __buffer.intValue(stringlen)));
	}

	// --- [ glGetNamedStringivARB ] ---

	/** JNI method for {@link #glGetNamedStringivARB GetNamedStringivARB} */
	@JavadocExclude
	public static native void nglGetNamedStringivARB(int namelen, long name, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedStringivARB GetNamedStringivARB} */
	@JavadocExclude
	public static void nglGetNamedStringivARB(int namelen, long name, int pname, long params) {
		long __functionAddress = getInstance().GetNamedStringivARB;
		nglGetNamedStringivARB(namelen, name, pname, params, __functionAddress);
	}

	/**
	 * Returns properties of the named string whose tree location corresponds to {@code name}.
	 *
	 * @param namelen the number of characters in {@code name}. If negative, {@code name} is considered to be a null-terminated string.
	 * @param name    the name associated with the string
	 * @param pname   the parameter to query. One of:<br>{@link #GL_NAMED_STRING_LENGTH_ARB NAMED_STRING_LENGTH_ARB}, {@link #GL_NAMED_STRING_TYPE_ARB NAMED_STRING_TYPE_ARB}
	 * @param params  a buffer in which to place the returned value
	 */
	public static void glGetNamedStringivARB(int namelen, ByteBuffer name, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, namelen);
			checkBuffer(params, 1 << 2);
		}
		nglGetNamedStringivARB(namelen, memAddress(name), pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedStringivARB GetNamedStringivARB} */
	public static void glGetNamedStringivARB(ByteBuffer name, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedStringivARB(name.remaining(), memAddress(name), pname, memAddress(params));
	}

	/** CharSequence version of: {@link #glGetNamedStringivARB GetNamedStringivARB} */
	public static void glGetNamedStringivARB(CharSequence name, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, false);
		int nameEncodedLen = __buffer.getOffset() - nameEncoded;
		nglGetNamedStringivARB(nameEncodedLen, __buffer.address(nameEncoded), pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedStringivARB GetNamedStringivARB} */
	public static int glGetNamedStringiARB(CharSequence name, int pname) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, false);
		int nameEncodedLen = __buffer.getOffset() - nameEncoded;
		int params = __buffer.intParam();
		nglGetNamedStringivARB(nameEncodedLen, __buffer.address(nameEncoded), pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

}